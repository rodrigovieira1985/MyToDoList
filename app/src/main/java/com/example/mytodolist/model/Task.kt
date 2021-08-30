package com.example.mytodolist.model

data class Task(
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    val id: Int = 0
)
