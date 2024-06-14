package com.bookweb.bookweb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.bookweb.bookweb.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    List<User> findByUsernameAndPassword(String username, String password);
    User findByUsername(@Param(value = "username")String username);
    
}
