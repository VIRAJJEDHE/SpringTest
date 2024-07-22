package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="task")
public class Task {  
    @Id
    private Long id;
    private String title;
    private String description;
    private Boolean completed;
    private LocalDateTime createdDate;
    
}
