package com.sub.springdemo2.repository;

import org.springframework.data.repository.CrudRepository;
import com.sub.springdemo2.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
