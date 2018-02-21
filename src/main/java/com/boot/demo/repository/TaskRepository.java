package com.boot.demo.repository;

import com.boot.demo.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long>{


}
