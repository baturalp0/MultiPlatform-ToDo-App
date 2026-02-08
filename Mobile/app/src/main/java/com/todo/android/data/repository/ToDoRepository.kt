package com.todo.android.data.repository

import com.todo.android.data.model.ToDo
import com.todo.android.data.remote.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ToDoRepository {

    private val api = RetrofitInstance.api

    suspend fun getAllToDos(): Result<List<ToDo>> = withContext(Dispatchers.IO) {
        try {
            val response = api.getAllToDos()
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Veri alınamadı: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun searchToDos(keyword: String): Result<List<ToDo>> = withContext(Dispatchers.IO) {
        try {
            val response = api.searchToDos(keyword)
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Arama başarısız: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun createToDo(todo: ToDo): Result<ToDo> = withContext(Dispatchers.IO) {
        try {
            val response = api.createToDo(todo)
            if (response.isSuccessful && response.body() != null) {
                Result.success(response.body()!!)
            } else {
                Result.failure(Exception("Kayıt başarısız: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun updateToDo(id: Int, todo: ToDo): Result<Unit> = withContext(Dispatchers.IO) {
        try {
            val response = api.updateToDo(id, todo)
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(Exception("Güncelleme başarısız: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun deleteToDo(id: Int): Result<Unit> = withContext(Dispatchers.IO) {
        try {
            val response = api.deleteToDo(id)
            if (response.isSuccessful) {
                Result.success(Unit)
            } else {
                Result.failure(Exception("Silme başarısız: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
