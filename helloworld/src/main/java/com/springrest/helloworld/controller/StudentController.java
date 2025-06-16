package com.springrest.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.helloworld.Model.Student;

@RestController
public class StudentController {

    @GetMapping("/student-name")
    public Student studentName() {
        return new Student("Kwaku", "Duah");
    }

    /*
     * @pathvariable annotation lets spring grab something from
     * a url and apply it to a method
     * 
     * subtle note: if the name in the url matches exactly as the method parameter
     * name , you can skip putting the names in the paths
     * 
     * for example if pathvariable was first_name != firstName, then you must
     * specify
     * but since pathvariable is same as firstName and lastName, you can skip it in
     * the paths
     * 
     */

    @GetMapping("/student/{firstName}/{lastName}")

    /*
     * the @pathvariable("firstName") and ...."lastName" are unnecessary, used
     * here for demonstration
     */
    public Student getInPath(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    @GetMapping("/student/query")
    public Student getRequest(

            /*
             * request params gives a tip in the url which guides a method in
             * carrying out a task. The specification of name = firstName is
             * unnecessary and redundant because the method parameter and the name
             * parameter are the same,
             * Left it here for basic reasons.
             */
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
