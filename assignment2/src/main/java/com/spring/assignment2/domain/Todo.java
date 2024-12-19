package com.spring.assignment2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Todo {
    // 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;

    // 생성자
    public Todo() {}

    public Todo(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
