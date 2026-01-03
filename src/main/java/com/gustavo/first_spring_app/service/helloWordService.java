package com.gustavo.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class helloWordService {

    public String helloWord(String name) {
        return "Hello word" + name + "!";
    } 
    
}
