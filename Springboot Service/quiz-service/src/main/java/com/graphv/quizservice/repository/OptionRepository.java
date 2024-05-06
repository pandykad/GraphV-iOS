package com.graphv.quizservice.repository;

import com.graphv.quizservice.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
