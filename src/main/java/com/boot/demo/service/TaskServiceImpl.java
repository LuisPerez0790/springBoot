package com.boot.demo.service;


import com.boot.demo.domain.Task;
import com.boot.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> getAll() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
     return this.taskRepository.save(task);
    }
}
