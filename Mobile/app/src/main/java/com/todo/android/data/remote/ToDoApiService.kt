package com.todo.android.data.remote

import com.todo.android.data.model.ToDo
import retrofit2.Response
import retrofit2.http.*

interface ToDoApiService {

    @GET("api/ToDos")
    suspend fun getAllToDos(): Response<List<ToDo>>

    @GET("api/ToDos/{id}")
    suspend fun getToDoById(@Path("id") id: Int): Response<ToDo>

    @GET("api/ToDos/search/{keyword}")
    suspend fun searchToDos(@Path("keyword") keyword: String): Response<List<ToDo>>

    @POST("api/ToDos")
    suspend fun createToDo(@Body todo: ToDo): Response<ToDo>

    @PUT("api/ToDos/{id}")
    suspend fun updateToDo(@Path("id") id: Int, @Body todo: ToDo): Response<Unit>

    @DELETE("api/ToDos/{id}")
    suspend fun deleteToDo(@Path("id") id: Int): Response<Unit>
}
