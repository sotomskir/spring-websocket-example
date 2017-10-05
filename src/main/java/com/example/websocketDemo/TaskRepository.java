package com.example.websocketDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface TaskRepository extends CrudRepository<Task, Long> {
}
