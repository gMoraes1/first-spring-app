package com.gustavo.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.first_spring_app.domain.User;
import com.gustavo.first_spring_app.service.helloWordService;

@RestController
@RequestMapping("/hello-word")
public class helloWordController {
    @Autowired
    private  helloWordService helloWordService;

 

    @GetMapping
    public String helloWord() {
        return helloWordService.helloWord("gustavo");
    }

    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "default") String filter, @RequestBody User name) {
        return "hello word post" + name.getName() + " " +  name.getEmail() + " " + id;
    }
}
