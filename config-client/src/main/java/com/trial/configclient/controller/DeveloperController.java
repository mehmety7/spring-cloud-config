package com.trial.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.job}")
    private String userJob;

    @GetMapping(path = "/developer")
    public ResponseEntity<String> getDeveloper() {
        String responseMessage = "Name: " + userName + "\nJob: " + userJob;
        return ResponseEntity.ok(responseMessage);
    }
}
