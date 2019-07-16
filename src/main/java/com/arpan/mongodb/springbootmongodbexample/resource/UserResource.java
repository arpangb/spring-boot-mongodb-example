package com.arpan.mongodb.springbootmongodbexample.resource;

import com.arpan.mongodb.springbootmongodbexample.model.User;
import com.arpan.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/get")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll(){
        return userRepository.findAll();
    }
}
