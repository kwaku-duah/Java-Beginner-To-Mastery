package com.practice.springcrud.DTO;

import java.util.Set;

import com.practice.springcrud.Entity.EmployeeRoleName;
import com.practice.springcrud.Entity.EmployeeStatus;

/*
 * employee response dto
 * gives modular control where I can decide fields that should go to the frontend
 * the frontend, decoupling at its best 
 */

public record EmployeeResponseDto(
    Long id,
    String firstName,
    String lastName,
    String email,
    Double salary,
    EmployeeStatus status,
    Set<EmployeeRoleName> roles
    //phoneNumber is intentionally hidden from response
) {}
