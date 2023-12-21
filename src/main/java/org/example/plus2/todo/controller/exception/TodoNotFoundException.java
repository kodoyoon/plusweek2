package org.example.plus2.todo.controller.exception;

public class TodoNotFoundException extends RuntimeException{

  public TodoNotFoundException(String message) {
    super(message);
  }

}
