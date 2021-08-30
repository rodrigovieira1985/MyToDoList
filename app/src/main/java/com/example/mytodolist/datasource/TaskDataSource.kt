package com.example.mytodolist.datasource

import com.example.mytodolist.model.Task

object TaskDataSource{
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task){
        list.add(task.copy(id = list.size + 1))
    }
}