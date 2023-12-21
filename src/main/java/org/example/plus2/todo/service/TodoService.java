package org.example.plus2.todo.service;

import lombok.RequiredArgsConstructor;
import org.example.plus2.todo.controller.exception.TodoNotFoundException;
import org.example.plus2.todo.dto.TodoAddRequestDto;
import org.example.plus2.todo.dto.TodoResponseDto;
import org.example.plus2.todo.entity.TodoEntity;
import org.example.plus2.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
  private final TodoRepository todoRepository;

  public TodoResponseDto addTodo(TodoAddRequestDto requestDto) {
    TodoEntity todoEntity = new TodoEntity(requestDto);
    TodoEntity saveTodo = todoRepository.save(todoEntity);
    return new TodoResponseDto(saveTodo);
  }

 public TodoResponseDto getTodo(Long todoId){
    TodoEntity todoEntity = getTodoEntity(todoId);
    return new TodoResponseDto(todoEntity);
 }
 public List<TodoResponseDto> getTodos() {
    return todoRepository.findAllByOrderByCreatedAtDesc().stream()
        .map(TodoResponseDto::new)
        .collect(Collectors.toList());
  }



  private TodoEntity getTodoEntity(Long todoId) {
    return todoRepository.findById(todoId)
        .orElseThrow(()  -> new TodoNotFoundException("해당 게시글을 찾을 수 없습니다."));
  }
}
