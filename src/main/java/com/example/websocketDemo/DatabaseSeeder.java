package com.example.websocketDemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    private final TaskRepository repository;

    public DatabaseSeeder(TaskRepository repository) {
        this.repository = repository;
    }

    public void fillWithTestdata() {
        this.repository.save(new Task("Task 1"));
        this.repository.save(new Task("Task 2"));
        this.repository.save(new Task("Task 3"));
        this.repository.save(new Task("Task 4"));
        this.repository.save(new Task("Task 5"));
    }
}
