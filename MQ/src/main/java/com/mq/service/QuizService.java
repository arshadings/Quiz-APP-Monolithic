package com.mq.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mq.dao.QuestionsDao;
import com.mq.dao.QuizDao;
import com.mq.entity.QuestionWrapper;
import com.mq.entity.Questions;
import com.mq.entity.Quiz;
import com.mq.entity.Response;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuestionsDao questionsDao;
	
	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		List<Questions> questions = questionsDao.findRandomQuestionsByCategory( category, numQ );
		
		Quiz quiz = new Quiz();
		quiz.setQuestions(questions);
		quiz.setTitle(title);
		
		quizDao.save(quiz);
		return new ResponseEntity<>( "Success", HttpStatus.CREATED );
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		Optional<Quiz> quiz = quizDao.findById(id);
		List<Questions> questionsFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionsForUser = new ArrayList<>();
		
		for( Questions q: questionsFromDB ) {
			QuestionWrapper qw = new QuestionWrapper( 
					q.getID(), 
					q.getQUESTIONTITLE(), 
					q.getOPTION1(), 
					q.getOPTION2(), 
					q.getOPTION3(), 
					q.getOPTION4() );
			questionsForUser.add(qw);
		}
		
		return new ResponseEntity<>( questionsForUser, HttpStatus.OK );
		
	}

	public ResponseEntity<Integer> calculateResults(Integer id, List<Response> response) {
		Optional<Quiz> quiz = quizDao.findById(id);
		List<Questions> questions = quiz.get().getQuestions();
		int score = 0;
		int i=0;
		for( Response r: response ) {
			if( r.getResponse().equals(questions.get(i).getANSWER()) )
				score++;
			i++;
		}
		return new ResponseEntity<>( score, HttpStatus.OK );
	}

}
