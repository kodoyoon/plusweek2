package org.example.plus2.comment.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.plus2.comment.controller.exception.CommentNotFouneException;
import org.example.plus2.comment.dto.CommentAddRequestDto;
import org.example.plus2.comment.dto.CommentResponseDto;
import org.example.plus2.comment.dto.CommentUpdateRequestDto;
import org.example.plus2.comment.entity.CommentEntity;
import org.example.plus2.comment.repository.CommentRepository;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;

@Service
@RequiredArgsConstructor
public class CommentService {
  private final CommentRepository commentRepository;

  public CommentResponseDto addComment(CommentAddRequestDto requestDto) {
    CommentEntity commentEntity = new CommentEntity(requestDto);
    CommentEntity saveComment = commentRepository.save(commentEntity);
    return new CommentResponseDto(saveComment);
  }

  @Transactional
  public CommentResponseDto updateComment(Long commentId, CommentUpdateRequestDto requestDto) {
    CommentEntity commentEntity = getCommentEntity(commentId);
    commentEntity.update(requestDto);
    return new CommentResponseDto(commentEntity);
  }

  public void deleteComment(Long commentId) {
    CommentEntity commentEntity = getCommentEntity(commentId);
    commentRepository.delete(commentEntity);
  }
  private CommentEntity getCommentEntity(Long commentId) {
    return commentRepository.findById(commentId)
        .orElseThrow(() -> new CommentNotFouneException("해당 댓글을 찾을 수 없습니다."));
  }

}
