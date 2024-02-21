package com.example.natasha.repozitory;

import com.example.natasha.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task,Long>{
}
