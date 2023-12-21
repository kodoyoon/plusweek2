package org.example.plus2.todo.repository;

import org.example.plus2.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity,Long> {
}
