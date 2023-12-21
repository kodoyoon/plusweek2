package org.example.plus2.todo.dto;

import lombok.Getter;

@Getter
public class TodoUpdateRequestDto {
  private String title;
  private String author;
  private String content;
}
