using System.Text;
using System.Text.Json;
using ToDoMVC.Models;

namespace ToDoMVC.Services
{
    public class ToDoApiService
    {
        private readonly HttpClient _httpClient;
        private readonly string _baseUrl = "http://localhost:5099/api/ToDos"; // API portunu kontrol et!

        public ToDoApiService(HttpClient httpClient)
        {
            _httpClient = httpClient;
        }

        // Tüm ToDo'ları getir
        public async Task<List<ToDo>> GetAllToDosAsync()
        {
            var response = await _httpClient.GetAsync(_baseUrl);
            response.EnsureSuccessStatusCode();
            
            var content = await response.Content.ReadAsStringAsync();
            var todos = JsonSerializer.Deserialize<List<ToDo>>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            });
            
            return todos ?? new List<ToDo>();
        }

        // ID'ye göre ToDo getir
        public async Task<ToDo?> GetToDoByIdAsync(int id)
        {
            var response = await _httpClient.GetAsync($"{_baseUrl}/{id}");
            
            if (!response.IsSuccessStatusCode)
                return null;
            
            var content = await response.Content.ReadAsStringAsync();
            return JsonSerializer.Deserialize<ToDo>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            });
        }

        // Arama
        public async Task<List<ToDo>> SearchToDosAsync(string keyword)
        {
            var response = await _httpClient.GetAsync($"{_baseUrl}/search/{keyword}");
            response.EnsureSuccessStatusCode();
            
            var content = await response.Content.ReadAsStringAsync();
            var todos = JsonSerializer.Deserialize<List<ToDo>>(content, new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true
            });
            
            return todos ?? new List<ToDo>();
        }

        // Yeni ToDo ekle
        public async Task<bool> CreateToDoAsync(ToDo todo)
        {
            var json = JsonSerializer.Serialize(todo);
            var content = new StringContent(json, Encoding.UTF8, "application/json");
            
            var response = await _httpClient.PostAsync(_baseUrl, content);
            return response.IsSuccessStatusCode;
        }

        // ToDo güncelle
        public async Task<bool> UpdateToDoAsync(int id, ToDo todo)
        {
            var json = JsonSerializer.Serialize(todo);
            var content = new StringContent(json, Encoding.UTF8, "application/json");
            
            var response = await _httpClient.PutAsync($"{_baseUrl}/{id}", content);
            return response.IsSuccessStatusCode;
        }

        // ToDo sil
        public async Task<bool> DeleteToDoAsync(int id)
        {
            var response = await _httpClient.DeleteAsync($"{_baseUrl}/{id}");
            return response.IsSuccessStatusCode;
        }
    }
}
