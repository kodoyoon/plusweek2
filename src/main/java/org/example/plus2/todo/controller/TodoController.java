package org.example.plus2.todo.controller;

import lombok.RequiredArgsConstructor;
import org.example.plus2.todo.dto.TodoAddRequestDto;
import org.example.plus2.todo.dto.TodoResponseDto;
import org.example.plus2.todo.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

  @GetMapping("/{todoId}") // 전체조회
  public ResponseEntity<TodoResponseDto> getTodo(
      @PathVariable Long todoId
  ){
    TodoResponseDto responseDto = todoService.getTodo(todoId);
    return ResponseEntity.ok(responseDto);
  }

  @GetMapping // 목록조회
  public ResponseEntity<List<TodoResponseDto>> getTodos() {
    List<TodoResponseDto> responseDto = todoService.getTodos();
    return ResponseEntity.ok(responseDto);
  }


}
