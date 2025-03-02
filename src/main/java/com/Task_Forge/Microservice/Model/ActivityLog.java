package com.Task_Forge.Microservice.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "activity_log")
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    private UUID userId;
    private UUID projectId;
    private String action;
//    private LocalDateTime timeStamp;
}
