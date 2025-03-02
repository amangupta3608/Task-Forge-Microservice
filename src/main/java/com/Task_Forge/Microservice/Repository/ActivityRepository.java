package com.Task_Forge.Microservice.Repository;

import com.Task_Forge.Microservice.Model.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityLog, UUID> {
}
