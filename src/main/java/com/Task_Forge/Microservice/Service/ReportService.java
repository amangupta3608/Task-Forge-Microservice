package com.Task_Forge.Microservice.Service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReportService {

    public String getProjectProgress(UUID projectId){
        //Implement logic to fetch project progress
        return "Project Progress Report";
    }

    public String getTeamPerformance(UUID projectId){
        //Implement logic to fetch team performance
        return "Team Performance Report";
    }
}
