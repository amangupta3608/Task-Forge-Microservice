package com.Task_Forge.Microservice.Service;

import com.Task_Forge.Microservice.Model.Task;
import com.Task_Forge.Microservice.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task getTaskById(UUID id){
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTask(UUID id){
        taskRepository.deleteById(id);
    }
}
