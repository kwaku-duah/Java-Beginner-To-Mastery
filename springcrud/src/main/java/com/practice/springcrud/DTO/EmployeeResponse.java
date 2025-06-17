package com.practice.springcrud.DTO;

/*
 * employee response dto
 * gives modular control where I can decide fields that should go to the frontend
 * the frontend, decoupling at its best 
 */

public record EmployeeResponse(
    Long id,
    String firstName,
    String lastName,
    String email,
    Double salary
    //phoneNumber is intentionally hidden from response
) {}
