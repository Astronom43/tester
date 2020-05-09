package ru.sergshubin.tester.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class SchoolTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameTest;
    @ElementCollection
    private Set<Long> questionKey;
}
