package com.example.mytodolist.datasource

import com.example.mytodolist.model.Task

object TaskDataSource{

    private val list = mutableListOf<Task>()

    fun getList() = list.toList()

    fun insertTask(task: Task){
        if(task.id == 0) {
            val index = list.maxByOrNull { it.id }
            if (index == null) {
                list.add(task.copy(id = list.size+1))
            }else {
                list.add(task.copy(id = Integer.parseInt(index?.id.toString()) + 1))
            }
        }else{
            val index = list.maxByOrNull { it.id }
            list.add(task.copy(id = Integer.parseInt(index?.id.toString()) + 1))
            list.remove(task)
        }

    }

    fun findById(taskId: Int) =  list.find { it.id == taskId }

    fun deleteTask(task: Any) {
        list.remove(task)

    }

}