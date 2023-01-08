package com.bus.service.signup.controllers;

import com.bus.service.signup.models.User;
import com.bus.service.signup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
        //this list method will likely only be used for testing purposes only due
        // to potentially large volume of data it can return.
    }

    @GetMapping
    @RequestMapping("{id}")
    public User get(@PathVariable String id){
        return userRepository.getReferenceById(id);
    }

    @PostMapping
    public User create(@RequestBody final User user){
        return userRepository.saveAndFlush(user);
    }
    @RequestMapping(value = "{id}", method =  RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        //TODO check for child records before deleting
        userRepository.deleteById(id);
    }
}
