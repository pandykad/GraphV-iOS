package com.graphv.quizservice.repository;

import com.graphv.quizservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>{
}