package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
