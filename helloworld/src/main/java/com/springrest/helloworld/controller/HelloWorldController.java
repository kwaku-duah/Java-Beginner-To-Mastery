package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController //@restcontroller = @controller + @responsebody annotations
public class HelloWorldController {
    /*@RestController tells spring, this is a web controller class
    simply return values all methods under this return in the HTML response
     * 
     * 
     * @GetMapping, tells spring, whenever the value in the annotation is matched, it
     * should return whatever that the method returns
     */


    @GetMapping("/helloworld") //@alias for requestmapping.
    public String helloWorld() {
        return "Hello World";
    }
}
