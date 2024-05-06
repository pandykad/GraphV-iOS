package com.graphv.quizservice.controller;


import com.graphv.quizservice.dto.QuizListResponse;
import com.graphv.quizservice.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/quiz")
public class QuizController {
    private final QuizService quizService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public QuizListResponse getQuizes(){
        return quizService.getQuizes();
    }

}
