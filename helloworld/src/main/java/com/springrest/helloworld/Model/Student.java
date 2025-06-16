package com.springrest.helloworld.Model;

/*
 * Build a springboot REST API that returns a Java bean
 * A bean is simply an object that is managed by spring
 */

public class Student {
    private String firstName;
    private String lastName;

    public Student(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
}
