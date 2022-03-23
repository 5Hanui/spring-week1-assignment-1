package com.codesoom.assignment.service;

import com.codesoom.assignment.models.Task;
import com.codesoom.assignment.repository.TodoRepository;

import java.util.List;
import java.util.Optional;

public class TodoService {

    private TodoRepository todoRepository = new TodoRepository();

    public List<Task> findAllTasks() {
        return todoRepository.findAllTasks();
    }

    public Optional<Task> findTaskById(Long id) {
        return todoRepository.findTaskById(id);
    }

}
