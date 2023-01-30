package com.sub.springdemo2.repository;

import org.springframework.data.repository.CrudRepository;
import com.sub.springdemo2.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
