package com.spring.assignment2.repository;

import com.spring.assignment2.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//<엔티티, 엔티티 식별자 타입>
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
