package com.graphv.quizservice.dto;

import com.graphv.quizservice.model.Quiz;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizListResponse {
    List<Quiz> quizList;
}


