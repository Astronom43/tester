package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergshubin.tester.entity.Question;

public interface QuestionRepo  extends JpaRepository<Question,Long> {

}
