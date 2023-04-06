package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Questions;
import com.example.demo.repository.questionsRepository;

@Service
public class questionsServiceImpl implements questionsService {

	@Autowired
	private questionsRepository repository;

	@Override
	public Questions saveQuestions(Questions question) {
		
		return repository.save(question);
	}

	
	public List<Questions> getQuestions() {
		
		return repository.findAll();
	}


	
	public List<Questions> getRandomQuestions(int count) {
		
List<Questions> allQuestions = repository.findAll();
        
        // If count is greater than or equal to the size of allQuestions, return allQuestions.
        if (count >= allQuestions.size()) {
            return allQuestions;
        }
    
    // Create a list of randomly selected questions.
    List<Questions> randomQuestions = new ArrayList<>();
    Set<Integer> selectedIndices = new HashSet<>();
    Random random = new Random();
    
    while (randomQuestions.size() < count) {
        int randomIndex = random.nextInt(allQuestions.size());
        if (!selectedIndices.contains(randomIndex)) {
            selectedIndices.add(randomIndex);
            randomQuestions.add(allQuestions.get(randomIndex));
        }
    }
    
    return randomQuestions;
}


	
	}

	
	

