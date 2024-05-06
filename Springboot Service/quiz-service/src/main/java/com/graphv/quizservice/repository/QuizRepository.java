package com.graphv.quizservice.repository;

import com.graphv.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
}