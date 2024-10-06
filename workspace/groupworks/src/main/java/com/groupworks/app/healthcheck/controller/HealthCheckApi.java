package com.groupworks.app.healthcheck.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class HealthCheckApi {

    @Value("${DB_URL}")
    private String dbUrl;

    @Value("${DB_USER_NAME}")
    private String dbUserName;

    @Value("${DB_DRIVER_CLASS_NAME}")
    private String dbDriverClassName;

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Success Health Check");
    }


}
