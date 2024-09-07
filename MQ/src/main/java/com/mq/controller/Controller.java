package com.mq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mq.entity.Questions;
import com.mq.service.QuestionService;

@RestController
@RequestMapping("/question")
public class Controller {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/allQuestions")
	public ResponseEntity<List<Questions>> getAllQuestions() {
		return questionService.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<List<Questions>> getQuestionByCategory( @PathVariable String category ) {
		return questionService.getQuestionsByCategory(category);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addQuestions( @RequestBody Questions questions ) {
		return questionService.addQuestions(questions);
	}
	
}
