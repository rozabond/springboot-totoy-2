package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.userRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.demo.model.User;

@CrossOrigin(origins = "http://localhost:8077")
@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private userRepository userRepository;

    @GetMapping("/users")
    public List < User > getUsers() {
        return this.userRepository.findAll();
    }
    
    @PostMapping("/users_save")
    public User createEmloyee(@RequestBody User employee) {
		return this.userRepository.save(employee);
    }
}