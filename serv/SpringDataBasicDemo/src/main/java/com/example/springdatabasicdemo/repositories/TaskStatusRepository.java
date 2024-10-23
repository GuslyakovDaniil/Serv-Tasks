package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
    Optional<TaskStatus> findByName(String name);
}

