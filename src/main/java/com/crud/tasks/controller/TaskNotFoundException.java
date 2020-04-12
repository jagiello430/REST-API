package com.crud.tasks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TaskNotFoundException extends Exception {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(TaskNotFoundException ex) {
        return ex.getMessage();
    }
}
