package com.springrest.helloworld.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* 
/**
 * Efficiently enhances object creation by eliminating boilerplate code
 * such as getters, setters, and constructors using Lombok annotations.
 *
 * - @Data generates getters, setters, toString, equals, and hashCode.
 * - @AllArgsConstructor generates a constructor with all fields as parameters.
 * - @NoArgsConstructor generates a default constructor with no parameters.
 * 
 * all this can be achieved by adding lombok dependency
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Children {
    private String fullName;
    private int age;
    private double height;
}
