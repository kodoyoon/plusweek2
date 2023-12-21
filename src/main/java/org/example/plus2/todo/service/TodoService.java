package org.example.plus2.todo.service;

import lombok.RequiredArgsConstructor;
import org.example.plus2.todo.dto.TodoAddRequestDto;
import org.example.plus2.todo.dto.TodoResponseDto;
import org.example.plus2.todo.entity.TodoEntity;
import org.example.plus2.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
  private final TodoRepository todoRepository;

  public TodoResponseDto addTodo(TodoAddRequestDto requestDto) {
    TodoEntity todoEntity = new TodoEntity(requestDto);
    TodoEntity saveTodo = todoRepository.save(todoEntity);
    return new TodoResponseDto(saveTodo);
  }
}
