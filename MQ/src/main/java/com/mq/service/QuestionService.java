package com.mq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mq.dao.QuestionsDao;
import com.mq.entity.Questions;

@Service
public class QuestionService {

	@Autowired
	QuestionsDao questionsDao;
	
	public ResponseEntity<List<Questions>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionsDao.findAll(), HttpStatus.OK);	
		} catch( Exception e  ) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<List<Questions>> getQuestionsByCategory(String category) {
		try {
			return new ResponseEntity<>(questionsDao.findByCATEGORY(category), HttpStatus.OK);
		} catch( Exception e  ) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> addQuestions(Questions questions) {
		questionsDao.save(questions);
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

}
