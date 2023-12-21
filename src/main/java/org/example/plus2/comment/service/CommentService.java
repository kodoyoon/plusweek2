package org.example.plus2.comment.service;

import lombok.RequiredArgsConstructor;
import org.example.plus2.comment.dto.CommentAddRequestDto;
import org.example.plus2.comment.dto.CommentResponseDto;
import org.example.plus2.comment.entity.CommentEntity;
import org.example.plus2.comment.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
  private final CommentRepository commentRepository;

  public CommentResponseDto addComment(CommentAddRequestDto requestDto) {
    CommentEntity commentEntity = new CommentEntity(requestDto);
    CommentEntity saveComment = commentRepository.save(commentEntity);
    return new CommentResponseDto(saveComment);
  }
}
