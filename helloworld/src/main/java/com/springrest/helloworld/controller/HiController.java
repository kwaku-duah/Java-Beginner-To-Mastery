package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @GetMapping("/basic-math")
    public int hiTest() {
        int add = 8;
        int bigValue = 233;
        return add * bigValue;

    }
}
