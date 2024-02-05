package com.example.natasha.controller;

import com.example.natasha.model.Customer;
import com.example.natasha.service.ServiceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {
    private final ServiceCustomer serviceCustomer ;

    @GetMapping("welcome/api")
    public String hello(){
        return "hello.html";
    }
    @PostMapping("/api")
    public String add(Customer customer){
        serviceCustomer.save(customer);

        return  "redirect:/api";

    }


}
