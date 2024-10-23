package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.TaskStatus;
import com.example.springdatabasicdemo.repositories.TaskStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskStatusService {

    @Autowired
    private TaskStatusRepository taskStatusRepository;

    @PostConstruct
    public void initTaskStatuses() {

        List<String> statuses = Arrays.asList("Новая", "В процессе", "Завершена");

        for (String statusName : statuses) {
            if (!taskStatusRepository.findByName(statusName).isPresent()) {
                TaskStatus status = new TaskStatus();
                status.setName(statusName);
                taskStatusRepository.save(status);
            }
        }
    }
}
