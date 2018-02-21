package com.boot.demo;

import com.boot.demo.domain.Task;
import com.boot.demo.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        
        return args -> {
            taskService.save(new Task(1L, "springBootApplication1", LocalDate.now(), true));
            taskService.save(new Task(2L, "springBootApplication2", LocalDate.now(), false));
            taskService.save(new Task(3L, "springBootApplication3", LocalDate.now(), true));
            taskService.save(new Task(4L, "springBootApplication4", LocalDate.now(), false));
            taskService.save(new Task(5L, "springBootApplication5", LocalDate.now(), true));
            taskService.save(new Task(6L, "springBootApplication6", LocalDate.now(), false));
            taskService.save(new Task(7L, "springBootApplication7", LocalDate.now(), true));
        };
    }
}
