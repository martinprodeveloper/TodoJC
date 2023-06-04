package com.example.todojc.addtasks.domain

import com.example.todojc.addtasks.data.TaskRepository
import com.example.todojc.addtasks.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.delete(taskModel)
    }

}