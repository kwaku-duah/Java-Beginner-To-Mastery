package com.springrest.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.helloworld.Model.Student;

/*
 * This is an attendance controller for students that uses List interface
 * 
 */
@RestController
public class AttendanceController {
    @GetMapping("/all-students")
    public List<Student> allStudents() {
        /*
         * this method takes a List of Students (duplication allowed)
         * and implements it with ArrayList, which is a dynamic array
         * List is a generic interface and is implemented underhood with
         * class ArrayList<>
         */
        List<Student> startSchool = new ArrayList<>();
        startSchool.add(new Student("Duah", "Kwaku"));
        startSchool.add(new Student("Mabel", "Serwaa"));
        startSchool.add(new Student("Irene", "Antwi"));
        startSchool.add(new Student("Trezeguet", "Mohammed"));
        startSchool.add(new Student("General", "Attiso"));
        startSchool.add(new Student("Wanzam", "Appiah"));
        startSchool.add(new Student("Baed", "Trappatoni"));
        startSchool.add(new Student("Williamson", "Agyekum"));
        startSchool.add(new Student("Tanor", "Gertrude"));
        startSchool.add(new Student("Bilboaz", "Yemenclev"));

        return startSchool;
        
    }
}
