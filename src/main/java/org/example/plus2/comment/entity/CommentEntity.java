package org.example.plus2.comment.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.plus2.comment.dto.CommentAddRequestDto;
import org.example.plus2.comment.dto.CommentUpdateRequestDto;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "comment")
public class CommentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String text; // -> comment같은거

  @Column
  private LocalDateTime createDate;

 public CommentEntity(CommentAddRequestDto requestDto) {
   this.text = requestDto.getText();
   this.createDate = LocalDateTime.now();
 }
 public void update(CommentUpdateRequestDto requestDto) {
   this.text = requestDto.getText();
   this.createDate = LocalDateTime.now();
 }
}