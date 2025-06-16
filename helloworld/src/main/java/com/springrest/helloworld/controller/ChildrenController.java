package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.helloworld.Model.Children;

/*
 * this class was created using lomboks annotation simple, easy and clean
 * 
 */

 @RestController
public class ChildrenController {
    
    @GetMapping("/child-info")
    public Children childDetails(){
        return new Children("Kwaku Duah",25, 170.24 );
    }
}
