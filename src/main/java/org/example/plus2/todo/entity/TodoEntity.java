package org.example.plus2.todo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.plus2.todo.dto.TodoAddRequestDto;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column
  private Long id;

  @Column
  private String title;

  @Column
  private String author;

  @Column
  private String content;

  @Column
  private LocalDateTime createDate;

  public TodoEntity(TodoAddRequestDto requestDto) {
    this.title = requestDto.getTitle();
    this.author = requestDto.getAuthor();
    this.content = requestDto.getContent();
    this.createDate = LocalDateTime.now();

  }
}
