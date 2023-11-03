package com.api.itc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthCheck {
    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "Estoy vivo!";
    }
}
