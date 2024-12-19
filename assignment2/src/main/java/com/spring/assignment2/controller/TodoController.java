package com.spring.assignment2.controller;

import com.spring.assignment2.dto.todo.TodoCreateRequestDto;
import com.spring.assignment2.dto.todo.TodoCreateResponsetDto;
import com.spring.assignment2.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/todos")
public class TodoController {

    //속성
    private final TodoService todoService;
    //생성자
    public TodoController (TodoService todoService) {
        this.todoService = todoService;
    }
    //기능 (HTTP Method)
    //json -> java object
    @PostMapping()
    public ResponseEntity<TodoCreateResponsetDto> createTodoAPI(@RequestBody TodoCreateRequestDto todoCreateRequestDto) {
        log.info("::: TodoController.createMemberAPI()");
        // 비즈니스 로직 호출
        TodoCreateResponsetDto response = todoService.createTodoService(todoCreateRequestDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
