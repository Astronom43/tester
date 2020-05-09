package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergshubin.tester.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result,Long> {
}
