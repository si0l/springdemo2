package com.sub.springdemo2.repository;

import org.springframework.data.repository.CrudRepository;
import com.sub.springdemo2.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
