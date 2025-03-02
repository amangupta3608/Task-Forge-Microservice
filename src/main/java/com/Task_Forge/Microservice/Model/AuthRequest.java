package com.Task_Forge.Microservice.Model;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}
