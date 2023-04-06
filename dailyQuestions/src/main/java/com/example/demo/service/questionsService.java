package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Questions;

@Service
public interface questionsService {

	

	Questions saveQuestions(Questions question);

	

	List<Questions> getQuestions();



	List<Questions> getRandomQuestions(int n);



}
