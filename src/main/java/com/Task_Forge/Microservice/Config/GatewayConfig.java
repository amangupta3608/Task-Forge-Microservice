package com.Task_Forge.Microservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("auth-service", r -> r.path("/auth/**").uri("https://localhost:8081"))
                .route("user-service", r -> r.path("/users/**").uri("https://localhost:8082"))
                .route("project-service", r -> r.path("/projects/**").uri("https://localhost:8083"))
                .route("task-service", r -> r.path("/tasks/**").uri("https://localhost:8084"))
                .build();
    }
}
