package org.example.plus2.todo.dto;

import org.example.plus2.todo.entity.TodoEntity;




public record TodoResponseDto (
    Long id,
    String title,
    String author,
    String content


) {
  public TodoResponseDto(TodoEntity saveTodo) {
    this(
        saveTodo.getId(),
        saveTodo.getTitle(),
        saveTodo.getAuthor(),
        saveTodo.getContent()

    );
  }
}