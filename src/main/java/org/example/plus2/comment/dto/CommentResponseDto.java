package org.example.plus2.comment.dto;


import org.example.plus2.comment.entity.CommentEntity;

import java.time.LocalDateTime;


public record CommentResponseDto (
    String text,
    LocalDateTime createDate


){

  public CommentResponseDto(CommentEntity saveComment) {
    this(
        saveComment.getText(),
        saveComment.getCreateDate()

    );

  }
}

