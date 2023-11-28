package com.crud.tasks.service;

import com.crud.tasks.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbService {
    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTask(final Long TaskId) throws TaskNotFoundException {
        return repository.findById(TaskId).orElseThrow(TaskNotFoundException::new);
    }
    public Task saveTask(final Task task) {
        return repository.save(task);
    }
    public void deleteTask(Task task) {
        repository.delete(task);
    }
}
