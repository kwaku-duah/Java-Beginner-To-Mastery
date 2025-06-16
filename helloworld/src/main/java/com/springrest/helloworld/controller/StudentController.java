package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.helloworld.Bean.Student;

@RestController
public class StudentController {

    @GetMapping("/student-name")
    public Student studentName() {
        return new Student("Kwaku", "Duah");
    }
}
