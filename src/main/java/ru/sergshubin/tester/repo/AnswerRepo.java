package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergshubin.tester.entity.Answer;
import ru.sergshubin.tester.entity.Question;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnswerRepo extends JpaRepository<Answer,Long> {

   Optional<List<Answer>> findAllByQuestion(Question q);


}
