package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    @Autowired
    private DbService dbService;
    @Autowired
    private TaskMapper taskMapper;

    @GetMapping(value = "getTasks")
    public List<TaskDto> getTasks() {
        return taskMapper.mapToTaskDtoList(dbService.getAllTasks());
    }

    @GetMapping(value = "getTask")
    public Task getTask(Long taskId) {
        return dbService.getTaskById(taskId);
    }

    @DeleteMapping(value = "deleteTask")
    public void deleteTask(Long taskId) {
    }

    @PutMapping(value = "updateTask")
    public TaskDto updateTask(TaskDto task) {
        return new TaskDto(1L, "Edited test title", "test content");
    }

    @PostMapping(value = "createTask")
    public void createTask(TaskDto task) {
    }
}
