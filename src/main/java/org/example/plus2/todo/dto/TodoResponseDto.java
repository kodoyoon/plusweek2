package org.example.plus2.todo.dto;

import org.example.plus2.todo.entity.TodoEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;


public record TodoResponseDto (
    Long id,
    String title,
    String author,
    String content,
    LocalDateTime createdAt


) {
  public TodoResponseDto(TodoEntity saveTodo) {
    this(
        saveTodo.getId(),
        saveTodo.getTitle(),
        saveTodo.getAuthor(),
        saveTodo.getContent(),
        saveTodo.getCreatedAt()

    );
  }
}