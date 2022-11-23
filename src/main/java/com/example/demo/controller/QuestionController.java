package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;

import com.example.demo.repository.QuestionRepository;


@CrossOrigin(origins = "http://localhost:8077")
@RestController
@RequestMapping("/Question/")
public class QuestionController {
	 @Autowired
	    private QuestionRepository userRepository;
	    
	    @PostMapping("/save")
	    public Question createEmloyee(@RequestBody Question question) {
			return this.userRepository.save(question);
	    }
}
