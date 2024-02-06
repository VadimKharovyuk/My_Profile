package com.example.natasha.controller;

import com.example.natasha.model.Customer;
import com.example.natasha.repozitory.ServiceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ListController {
    private final ServiceCustomer  serviceCustomer;
 @GetMapping("/welcome/api/all")

    public String list ( Model model){
        List<Customer> customerList = serviceCustomer.findAll();
        model.addAttribute("customerList",customerList);

        return  "list";
    }


}
