package com.example.natasha.repositotyUser;

import com.example.natasha.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser,Long> {
    Optional<MyUser> findByName (String username);
}
