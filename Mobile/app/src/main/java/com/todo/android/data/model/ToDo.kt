package com.todo.android.data.model

data class ToDo(
    val id: Int = 0,
    val name: String = "",
    val isCompleted: Boolean = false,
    val createdAt: String
)

