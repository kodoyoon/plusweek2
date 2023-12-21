package org.example.plus2.todo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.plus2.todo.dto.TodoAddRequestDto;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "todo")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoEntity extends TimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(nullable = false)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String author;

  @Column(nullable = false)
  private String content;



  public TodoEntity(TodoAddRequestDto requestDto) {
    this.title = requestDto.getTitle();
    this.author = requestDto.getAuthor();
    this.content = requestDto.getContent();


  }
}
