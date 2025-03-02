package com.Task_Forge.Microservice.Service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NotificationService {

    public String getUserNotifications(UUID userId){
        //Implement logic to fetch user notifications
        return "User notification";
    }

    public String markNotificationAsRead(UUID id) {
        // Implement logic to mark notification as read
        return "Notification marked as read";
    }
}
