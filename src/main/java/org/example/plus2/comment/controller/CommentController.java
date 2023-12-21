package org.example.plus2.comment.controller;

import lombok.RequiredArgsConstructor;
import org.example.plus2.comment.dto.CommentAddRequestDto;
import org.example.plus2.comment.dto.CommentResponseDto;
import org.example.plus2.comment.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/comments")
@RestController
@RequiredArgsConstructor
public class CommentController {
  private final CommentService commentService;

  @PostMapping // 댓글작성
    public ResponseEntity<CommentResponseDto> addComment(
    @RequestBody CommentAddRequestDto requestDto
      ){
          CommentResponseDto responseDto = commentService.addComment(requestDto);
          return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);  }
}
