package com.example.demo.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Task;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//Operations
//GET
//POST
//UPDATE
//DELETE
@RestController
public class TaskController {

    // @Autowired
    // TaskRepo repo;

    @GetMapping(path="/tasks")
    public Task getTasks(){
        return new Task(1L,"First Task","First Description",false,LocalDateTime.now());
    }
    @GetMapping(path="/task/{id}")
    public String getTask(@PathVariable("id") Long id){
        return "hello, this will soon be updated to show task with id "+id;
    }
    // @PostMapping("/create-task")
    // public String postMethodName(@RequestBody String entity) {
    //     //TODO: process POST request
        
    //     return entity;
    // }
    
}
