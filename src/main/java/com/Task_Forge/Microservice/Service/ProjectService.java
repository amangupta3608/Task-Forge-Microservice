package com.Task_Forge.Microservice.Service;


import com.Task_Forge.Microservice.Model.Project;
import com.Task_Forge.Microservice.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project createProject(Project project){
        return projectRepository.save(project);
    }

    public Project getProjectById(UUID id){
        return projectRepository.findById(id).orElse(null);
    }

    public Project updateProject(Project project){
        return projectRepository.save(project);
    }

    public void deleteProject(UUID id){
        projectRepository.deleteById(id);
    }
}
