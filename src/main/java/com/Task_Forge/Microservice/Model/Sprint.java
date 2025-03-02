package com.Task_Forge.Microservice.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "sprints")
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private UUID projectId;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private String status;

//    private LocalDateTime createdAt;

}
