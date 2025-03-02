package com.Task_Forge.Microservice.Service;

import com.Task_Forge.Microservice.Model.Sprint;
import com.Task_Forge.Microservice.Repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SprintService {

    @Autowired
    private SprintRepository sprintRepository;

    private Sprint createSprint(Sprint sprint){
        return sprintRepository.save(sprint);
    }

    private Sprint getSprintById(UUID id){
        return sprintRepository.findById(id).orElse(null);
    }

    private Sprint updateSprint(Sprint sprint){
        return sprintRepository.save(sprint);
    }

    private void deleteSprint(UUID id){
        sprintRepository.deleteById(id);
    }
}
