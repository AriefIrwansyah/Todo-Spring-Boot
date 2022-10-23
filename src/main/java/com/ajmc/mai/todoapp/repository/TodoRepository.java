package com.ajmc.mai.todoapp.repository;

import com.ajmc.mai.todoapp.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
