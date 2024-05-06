package com.graphv.quizservice.service;

import com.graphv.quizservice.dto.QuizListResponse;
import com.graphv.quizservice.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;

    public QuizListResponse getQuizes() {
        QuizListResponse quizListResponse = new QuizListResponse();
        quizListResponse.setQuizList(quizRepository.findAll());
        return quizListResponse;
    }
}
