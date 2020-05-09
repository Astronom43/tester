package ru.sergshubin.tester.service.impl;

import org.springframework.stereotype.Service;
import ru.sergshubin.tester.entity.Question;
import ru.sergshubin.tester.repo.QuestionRepo;
import ru.sergshubin.tester.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepo questionRepo;

    public QuestionServiceImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Question findById(Long id) {
        return questionRepo.findById(id).orElseThrow(()->new IllegalArgumentException("ID не найден"));
    }

    @Override
    public Long save(Question question) {
        return questionRepo.saveAndFlush(question).getId();
    }

    @Override
    public boolean delete(Question question) {
        var id = question.getId();
        questionRepo.delete(question);
        return questionRepo.existsById(id);
    }
}
