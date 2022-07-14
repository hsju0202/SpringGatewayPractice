package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator demo1Route(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("demo1", r -> r.path("/demo1/**")
                        .uri("http://localhost:8081"))
                .build();
    }
}
