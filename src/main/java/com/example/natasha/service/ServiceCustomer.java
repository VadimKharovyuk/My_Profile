package com.example.natasha.service;

import com.example.natasha.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCustomer extends JpaRepository<Customer,Long> {



}
