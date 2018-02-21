package com.boot.demo.service;


import com.boot.demo.domain.Task;
import org.springframework.stereotype.Service;


public interface TaskService {

    Iterable<Task> getAll();

    Task save(Task task);

}
