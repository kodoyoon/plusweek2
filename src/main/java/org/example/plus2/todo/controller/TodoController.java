package org.example.plus2.todo.controller;

import lombok.RequiredArgsConstructor;
import org.example.plus2.todo.dto.TodoAddRequestDto;
import org.example.plus2.todo.dto.TodoResponseDto;
import org.example.plus2.todo.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {
  private final TodoService todoService;

  @PostMapping //할일카드 작성
  public ResponseEntity<TodoResponseDto> addTodo(
      @RequestBody TodoAddRequestDto requestDto
      ){
    TodoResponseDto responseDto = todoService.addTodo(requestDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
  }
}
