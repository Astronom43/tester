package ru.sergshubin.tester.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    @ManyToOne(cascade = CascadeType.ALL)
    private Question question;
    private boolean isValid;
}
