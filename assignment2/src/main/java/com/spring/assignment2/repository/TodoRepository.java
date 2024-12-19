package com.spring.assignment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository {
    public interface TodoRepository extends JpaRepository<Entity,> //<엔티티, 엔티티 식별자 타입>
}
