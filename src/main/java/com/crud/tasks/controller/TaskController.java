package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping("/getTasks")
    List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @GetMapping("/getTask/id")
    TaskDto getTask(Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping
    void deleteTask(Long taskId) {
    }

    @PutMapping("/update/id")
    TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PostMapping("/create")
    void createTask(TaskDto taskDto) {
    }
}
