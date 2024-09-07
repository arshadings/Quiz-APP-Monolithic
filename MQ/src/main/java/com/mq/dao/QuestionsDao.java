package com.mq.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mq.entity.Questions;

@Repository
public interface QuestionsDao extends JpaRepository<Questions, Integer> {
	
	List<Questions> findByCATEGORY(String category);

	@Query( value= "SELECT * from questions q where q.CATEGORY=:category ORDER BY RANDOM() LIMIT:numQ", nativeQuery=true )
	List<Questions> findRandomQuestionsByCategory(String category, int numQ);

}
