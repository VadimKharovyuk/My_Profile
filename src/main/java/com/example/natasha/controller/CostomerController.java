package com.example.natasha.controller;

import com.example.natasha.model.Customer;
import com.example.natasha.service.ServiceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CostomerController {
    private final ServiceCustomer customer;

   @GetMapping("/all")
    public List<Customer> customerList (){
        return customer.findAll();

    }
}
