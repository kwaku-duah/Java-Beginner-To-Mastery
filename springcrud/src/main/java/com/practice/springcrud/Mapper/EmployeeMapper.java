package com.practice.springcrud.Mapper;

import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;
import com.practice.springcrud.Entity.Employee;

/*
 * mapper class or interface is responsible for converting between 
 * two different layers of objects
 * 
 * clearly explained here -> there is entity ----> dto 
 * select fields from entity that should goto dto
 * 
 * and then there is Dto receiving a request that must be translated atop 
 * an entity
 * so simply entity to response dtoresponse and 
 * request dto translation to an entity
 */

public interface EmployeeMapper {
    /*
     * this method takes an employeerequest returns an employee object
     * created from employee entity
     * 
     */
    Employee toEntity(EmployeeRequestDto dto);

    /*
     * takes an employee object (entity and then 
     * returns only fields defined in the response)
     */
    EmployeeResponseDto toResponseDto(Employee employee);
}

//this binds the entity to the DTO