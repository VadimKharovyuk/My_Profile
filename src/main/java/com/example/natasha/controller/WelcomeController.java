package com.example.natasha.controller;

import com.example.natasha.model.MyUser;
import com.example.natasha.repositotyUser.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class WelcomeController {
  private   UserRepository userRepository;
  private PasswordEncoder passwordEncoder ;


    @GetMapping("/welcome")
    public String welcomePage(){
        return "welcome";
    }
    @PostMapping("/welcome")
    public String addUser( MyUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
         return  "redirect:/welcome";


    }


    }




