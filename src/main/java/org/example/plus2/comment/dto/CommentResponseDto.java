package org.example.plus2.comment.dto;


import org.example.plus2.comment.entity.CommentEntity;

import java.time.LocalDateTime;


public record CommentResponseDto (
Long id,
    String text,
    LocalDateTime createDate


){

  public CommentResponseDto(CommentEntity saveComment) {
    this(
        saveComment.getId(),
        saveComment.getText(),
        saveComment.getCreateDate()

    );

  }
}

