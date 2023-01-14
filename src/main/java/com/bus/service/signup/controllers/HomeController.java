package com.bus.service.signup.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.service.usage}")
    private String appServiceUsage;
    @GetMapping
    @RequestMapping("/")
    public Map getStatus(){
        Map map = new HashMap<String,String>();
        map.put("app-service-usage",appServiceUsage);
        return map;
    }
}
