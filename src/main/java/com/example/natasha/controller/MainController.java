package com.example.natasha.controller;

import com.example.natasha.model.Customer;
import com.example.natasha.repozitory.ServiceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MainController {
    private final ServiceCustomer serviceCustomer;

    @GetMapping("welcome/new-user/api")
    public String hello(){
        return "hello";
    }
    @PostMapping("/welcome/new-user/api")
    public String add(Customer customer){
        serviceCustomer.save(customer);

        return  "redirect:/welcome";

    }


}
