package org.example.plus2.todo.repository;

import org.example.plus2.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface TodoRepository extends JpaRepository<TodoEntity,Long> {

  List<TodoEntity> findAllByOrderByCreatedAtDesc();
}
