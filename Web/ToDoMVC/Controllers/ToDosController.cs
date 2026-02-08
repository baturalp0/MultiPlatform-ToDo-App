using Microsoft.AspNetCore.Mvc;
using ToDoMVC.Models;
using ToDoMVC.Services;

namespace ToDoMVC.Controllers
{
    public class ToDosController : Controller
    {
        private readonly ToDoApiService _apiService;

        public ToDosController(ToDoApiService apiService)
        {
            _apiService = apiService;
        }

        // GET: ToDos
        public async Task<IActionResult> Index(string search)
        {
            List<ToDo> todos;

            if (!string.IsNullOrEmpty(search))
            {
                todos = await _apiService.SearchToDosAsync(search);
                ViewBag.SearchKeyword = search;
            }
            else
            {
                todos = await _apiService.GetAllToDosAsync();
            }

            return View(todos);
        }

        // GET: ToDos/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: ToDos/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create(ToDo todo)
        {
            if (ModelState.IsValid)
            {
                var success = await _apiService.CreateToDoAsync(todo);
                if (success)
                {
                    return RedirectToAction(nameof(Index));
                }
                ModelState.AddModelError("", "Kayıt sırasında bir hata oluştu.");
            }
            return View(todo);
        }

        // GET: ToDos/Edit/5
        public async Task<IActionResult> Edit(int id)
        {
            var todo = await _apiService.GetToDoByIdAsync(id);
            if (todo == null)
            {
                return NotFound();
            }
            return View(todo);
        }

        // POST: ToDos/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, ToDo todo)
        {
            if (id != todo.Id)
            {
                return BadRequest();
            }

            if (ModelState.IsValid)
            {
                var success = await _apiService.UpdateToDoAsync(id, todo);
                if (success)
                {
                    return RedirectToAction(nameof(Index));
                }
                ModelState.AddModelError("", "Güncelleme sırasında bir hata oluştu.");
            }
            return View(todo);
        }

        // POST: ToDos/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Delete(int id)
        {
            await _apiService.DeleteToDoAsync(id);
            return RedirectToAction(nameof(Index));
        }

        // POST: ToDos/ToggleComplete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> ToggleComplete(int id)
        {
            var todo = await _apiService.GetToDoByIdAsync(id);
            if (todo != null)
            {
                todo.IsCompleted = !todo.IsCompleted;
                await _apiService.UpdateToDoAsync(id, todo);
            }
            return RedirectToAction(nameof(Index));
        }
    }
}
