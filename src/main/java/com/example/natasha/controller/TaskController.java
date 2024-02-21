package com.example.natasha.controller;

import com.example.natasha.repozitory.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class TaskController {
    private final TaskRepository taskRepository ;
    @GetMapping("/task")
    public String mainTask(Model model){
        model.addAttribute("task",taskRepository.findAll());
        return "task";
    }
    @PostMapping("/task/new")
    public String createTask(){
        return  "createTask";
    }
}
