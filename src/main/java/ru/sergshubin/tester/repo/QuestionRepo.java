package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergshubin.tester.entity.Question;

import java.util.List;

@Repository
public interface QuestionRepo  extends JpaRepository<Question,Long> {

}
