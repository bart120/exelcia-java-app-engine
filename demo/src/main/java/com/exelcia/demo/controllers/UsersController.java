package com.exelcia.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @GetMapping("/users")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<String>("Bob", HttpStatus.OK);
    }
}
