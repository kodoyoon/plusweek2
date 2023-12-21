package org.example.plus2.todo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoAddRequestDto {
  private String title;
  private String author;
  private String content;
}
