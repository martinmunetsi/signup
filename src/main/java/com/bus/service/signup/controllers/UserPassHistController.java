package com.bus.service.signup.controllers;


import com.bus.service.signup.models.UserPassHist;
import com.bus.service.signup.repositories.UserPassHistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/userPassHistory")
public class UserPassHistController {
    @Autowired
    private UserPassHistRepository userPassHistRepository;

    @GetMapping
    public List<UserPassHist> list(){
        return userPassHistRepository.findAll();
        //this list method will likely only be used for testing purposes only due
        // sensitivity of the returned data
    }

    @GetMapping
    @RequestMapping("{id}")
    public UserPassHist get(@PathVariable Long id){
        return userPassHistRepository.getReferenceById(id);
    }

    @PostMapping
    public UserPassHist create(@RequestBody final UserPassHist userPassHist){
        return userPassHistRepository.saveAndFlush(userPassHist);
    }
    @RequestMapping(value = "{id}", method =  RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userPassHistRepository.deleteById(id);
    }
}
