package com.spring.assignment2.service;

import com.spring.assignment2.domain.Todo;
import com.spring.assignment2.dto.todo.TodoCreateRequestDto;
import com.spring.assignment2.dto.todo.TodoCreateResponsetDto;
import com.spring.assignment2.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TodoService {
    //속성
    private final TodoRepository todoRepository;
    //생성자
    public TodoService (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    //기능
    public TodoCreateResponsetDto createTodoService(TodoCreateRequestDto todoCreateRequestDto) {
        // 1. 비즈니스 로직 처리
        String email = todoCreateRequestDto.getEmail();
        String name = todoCreateRequestDto.getName();

        //엔티티 조합
        Todo newTodo = new Todo(email, name);

        // 2. 데이터 저장
        Todo savedTodo = todoRepository.save(newTodo);
        Long savedTodoId = savedTodo.getId();

        log.info("::: TodoService.createTodoService()");
        return new TodoCreateResponsetDto();
    }

}
