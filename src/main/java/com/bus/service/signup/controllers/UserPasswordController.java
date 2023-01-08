package com.bus.service.signup.controllers;



import com.bus.service.signup.models.User;
import com.bus.service.signup.models.UserPassword;
import com.bus.service.signup.repositories.UserPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/userPassword")
public class UserPasswordController {
    @Autowired
    private UserPasswordRepository userPasswordRepository;

    @GetMapping
    public List<UserPassword> list(){
        return userPasswordRepository.findAll();
        //this list method will likely only be used for testing purposes only due
        // sensitivity of the returned data (password hashes)
    }

    @GetMapping
    @RequestMapping("{id}")
    public UserPassword get(@PathVariable Long id){
        return userPasswordRepository.getReferenceById(id);
    }
    @PostMapping
    public UserPassword create(@RequestBody final UserPassword userPassword){
        return userPasswordRepository.saveAndFlush(userPassword);
    }
    @RequestMapping(value = "{id}", method =  RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userPasswordRepository.deleteById(id);
    }
}
