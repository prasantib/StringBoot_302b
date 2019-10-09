package com.example.demo;


import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

public interface Todorepository extends CrudRepository<Todo, Long>{
}

