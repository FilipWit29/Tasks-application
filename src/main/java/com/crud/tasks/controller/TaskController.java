package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final DbService service;
    private final TaskMapper taskMapper;


    @GetMapping
    List<TaskDto> getTasks() {
        List<Task> tasks = service.getAllTasks();
        return taskMapper.mapToTaskDtoList(tasks);
    }

    @GetMapping("{taskId}")
    TaskDto getTask(@PathVariable Long taskId) {
        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping("/delete/{taskId}")
    void deleteTask(@PathVariable Long taskId) {
    }

    @PutMapping("/update/{taskId}")
    TaskDto updateTask(TaskDto taskDto, @PathVariable Long taskId) {
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PostMapping("/new/")
    void createTask(TaskDto taskDto) {
    }
}
