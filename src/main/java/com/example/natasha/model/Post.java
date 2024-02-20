package com.example.natasha.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title,anons,full_text;
    private int views;

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;

    }
//начало работы

}
