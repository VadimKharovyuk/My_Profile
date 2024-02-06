package com.example.natasha.repozitory;

import com.example.natasha.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCustomer extends JpaRepository<Customer,Long> {
}
