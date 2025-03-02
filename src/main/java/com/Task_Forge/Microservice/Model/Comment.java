package com.Task_Forge.Microservice.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID taskId;
    private UUID userId;
    private String message;
//    private LocalDateTime timeStamp;
}
