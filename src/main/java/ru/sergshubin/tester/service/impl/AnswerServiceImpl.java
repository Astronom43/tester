package ru.sergshubin.tester.service.impl;

import org.springframework.stereotype.Service;
import ru.sergshubin.tester.entity.Answer;
import ru.sergshubin.tester.entity.Question;
import ru.sergshubin.tester.repo.AnswerRepo;
import ru.sergshubin.tester.service.AnswerService;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepo answerRepo;

    public AnswerServiceImpl(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }


    @Override
    public Answer findById(Long id) {
        return answerRepo.findById(id).orElseThrow(()->new IllegalArgumentException("ID не найден"));
    }

    @Override
    public Long save(Answer answer) {
        return answerRepo.saveAndFlush(answer).getId();
    }

    @Override
    public boolean delete(Answer answer) {
        long id = answer.getId();
        answerRepo.delete(answer);
        return answerRepo.existsById(id);
    }

    @Override
    public List<Answer> findByQuestion(Question question) {
        var rez = answerRepo.findAllByQuestion(question);
        return rez.orElseThrow(()->new IllegalArgumentException("У этого впроса нет ответов"));
    }
}
