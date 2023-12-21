package org.example.plus2.todo.dto;

import lombok.Getter;


@Getter
public class TodoAddRequestDto {
  private String title;
  private String author;
  private String content;
}
