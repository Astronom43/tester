package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sergshubin.tester.entity.Question;

import java.util.List;

public interface QuestionRepo  extends JpaRepository<Question,Long> {

}
