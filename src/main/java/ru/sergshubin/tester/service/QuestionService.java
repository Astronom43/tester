package ru.sergshubin.tester.service;

import org.springframework.stereotype.Component;
import ru.sergshubin.tester.entity.Question;

@Component
public interface QuestionService {
    Question findById(Long id);
    Long save(Question question);
    boolean delete(Question question);

}
