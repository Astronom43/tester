package ru.sergshubin.tester.service;

import org.springframework.stereotype.Component;
import ru.sergshubin.tester.entity.Question;
import ru.sergshubin.tester.entity.Result;

import java.util.List;

@Component
public interface ResultService {
    Result findById(Long id);
    Long save(Result result);
    boolean delete(Result result);
    List<Result> findByQuestion(Question question);
}
