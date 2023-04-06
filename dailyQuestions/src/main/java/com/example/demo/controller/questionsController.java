package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Questions;
import com.example.demo.service.questionsService;

@RestController
public class questionsController {
@Autowired
private questionsService service;
@PostMapping("/post")
public Questions saveData(@RequestBody Questions question) {
	
	return service.saveQuestions(question);
}
@GetMapping("/get")
public List<Questions> getData() {
	return service.getQuestions();
}
@GetMapping("/questions/random/{n}")
public List<Questions> getRandomQuestionsN(@PathVariable int n) {
    return service.getRandomQuestions(n);
}
}
