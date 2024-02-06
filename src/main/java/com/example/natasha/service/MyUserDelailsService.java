package com.example.natasha.service;

import com.example.natasha.model.MyUser;
import com.example.natasha.repositotyUser.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class MyUserDelailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository ;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user = repository.findByName(username);
        return user.map(MyUserDetails::new)
                .orElseThrow( () -> new UsernameNotFoundException( username +" пользователь не  найден"));
    }
}
