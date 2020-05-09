package ru.sergshubin.tester.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sergshubin.tester.entity.SchoolTest;

@Repository
public interface SchoolTestRepo extends JpaRepository<SchoolTest,Long> {
}
