package com.boot.demo.controller;

import com.boot.demo.domain.Task;
import com.boot.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> getAll() {
        return taskService.getAll();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
