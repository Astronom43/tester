package ru.sergshubin.tester.service;

import org.springframework.stereotype.Component;
import ru.sergshubin.tester.entity.Answer;
import ru.sergshubin.tester.entity.Question;

import java.util.List;

@Component
public interface AnswerService {
    Answer findById(Long id);
    Long save(Answer answer);
    boolean delete(Answer answer);
    List<Answer> findByQuestion(Question question);
}
