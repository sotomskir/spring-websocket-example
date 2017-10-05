package com.example.websocketDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "rs_task")
public class Task implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Boolean completed;

    @Column(nullable = false)
    private String name;

    public Task() {
    }

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fillWithTestdata() {

    }
}
