package ru.sergshubin.tester.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import ru.sergshubin.tester.entity.Question;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class QuestionServiceImplTest {

    private Question q1,q2 = new Question(),q3;

    @Resource(name = "questionServiceImpl")
    QuestionServiceImpl service;

    @Autowired
    TestEntityManager entityManager;
    

    @BeforeEach
    void setUp() {
        q1 = new Question();
        q1.setText("1");
        q2 = new Question();
        q2.setText("2");
        q3 = new Question();
        q3.setText("3");
        entityManager.persist(q1);
        entityManager.persist(q2);
        entityManager.persist(q3);
        entityManager.flush();
    }

    @AfterEach
    void tearDown() {
        entityManager.remove(q1);
        entityManager.remove(q2);
        entityManager.remove(q3);
        entityManager.flush();
    }

    @Test
    void findById() {
        var id1 = q1.getId();
        var q1Db = service.findById(id1);
        assertEquals(q1,q1Db);

    }

    @Test
    void save() {

    }

    @Test
    void delete() {
    }
}