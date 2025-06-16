package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController //restcontroller = @controller + @responsebody annotations
public class HelloWorldController {
    
    public String helloWorld() {
        return "Hello World";
    }
}
