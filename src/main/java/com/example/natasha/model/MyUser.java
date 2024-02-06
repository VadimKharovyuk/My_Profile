package com.example.natasha.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String password;
    private String role;



}
