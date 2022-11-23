package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.prayerRepository;
import com.example.demo.model.Prayer;

@CrossOrigin(origins = "http://localhost:8077")
@RestController
@RequestMapping("/prayer/")
public class PrayerController {

    @Autowired
    private prayerRepository prayerRepository;
    
    @GetMapping("/getall")
    public List < Prayer > getUsers() {
        return this.prayerRepository.findAll();
    }
    
    @PostMapping("/prayer_save")
    public Prayer createEmloyee(@RequestBody Prayer prayer) {
    	System.out.println(prayer.getFirstName());
		return this.prayerRepository.save(prayer);
    }
}