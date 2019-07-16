package com.arpan.mongodb.springbootmongodbexample.repository;

import com.arpan.mongodb.springbootmongodbexample.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
