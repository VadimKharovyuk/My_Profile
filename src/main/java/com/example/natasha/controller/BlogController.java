package com.example.natasha.controller;

import com.example.natasha.model.Post;
import com.example.natasha.repozitory.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class BlogController {
    private final PostRepository postRepository ;
    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts =postRepository.findAll();
        model.addAttribute("posts",posts);

        return "blog-main";
    }
}
