package com.todo.android.viewmodel

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.todo.android.data.model.ToDo
import com.todo.android.data.repository.ToDoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDateTime

class ToDoViewModel : ViewModel() {

    private val repository = ToDoRepository()

    // UI State
    private val _todos = MutableStateFlow<List<ToDo>>(emptyList())
    val todos: StateFlow<List<ToDo>> = _todos.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    init {
        loadToDos()
    }

    fun loadToDos() {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            repository.getAllToDos()
                .onSuccess { todos ->
                    _todos.value = todos
                }
                .onFailure { exception ->
                    _error.value = exception.message ?: "Bilinmeyen hata"
                }

            _isLoading.value = false
        }
    }

    fun searchToDos(query: String) {
        _searchQuery.value = query

        if (query.isBlank()) {
            loadToDos()
            return
        }

        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            repository.searchToDos(query)
                .onSuccess { todos ->
                    _todos.value = todos
                }
                .onFailure { exception ->
                    _error.value = exception.message ?: "Arama başarısız"
                }

            _isLoading.value = false
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun createToDo(name: String, isCompleted: Boolean = false) {
        if (name.isBlank()) return

        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            val newTodo = ToDo(name = name, isCompleted = isCompleted, createdAt = LocalDateTime.now().toString())

            repository.createToDo(newTodo)
                .onSuccess {
                    loadToDos() // Listeyi yenile
                }
                .onFailure { exception ->
                    _error.value = exception.message ?: "Kayıt başarısız"
                }

            _isLoading.value = false
        }
    }

    fun updateToDo(id: Int, name: String, isCompleted: Boolean, createdAt: String) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            val updatedTodo = ToDo(
                id = id,
                name = name,
                isCompleted = isCompleted,
                createdAt = createdAt
            )

            repository.updateToDo(id, updatedTodo)
                .onSuccess {
                    loadToDos() // Listeyi yenile
                }
                .onFailure { exception ->
                    _error.value = exception.message ?: "Güncelleme başarısız"
                }

            _isLoading.value = false
        }
    }

    fun toggleComplete(todo: ToDo) {
        updateToDo(
            id = todo.id,
            name = todo.name,
            isCompleted = !todo.isCompleted,
            createdAt = todo.createdAt
        )
    }

    fun deleteToDo(id: Int) {
        viewModelScope.launch {
            _isLoading.value = true
            _error.value = null

            repository.deleteToDo(id)
                .onSuccess {
                    loadToDos() // Listeyi yenile
                }
                .onFailure { exception ->
                    _error.value = exception.message ?: "Silme başarısız"
                }

            _isLoading.value = false
        }
    }

    fun clearError() {
        _error.value = null
    }
}
