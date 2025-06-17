package com.practice.springcrud.Service;

import java.util.List;
import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;

/*
 * Employee service interface to determine what should be done
 */

public interface EmployeeService {
    /*
     * create an employee with employeerequestdto
     * and return employeeresponsedto
     */
    EmployeeResponseDto createEmployee(EmployeeRequestDto dto);

    /*
     * find employee by id
     */
    EmployeeResponseDto getEmployeeById(Long id);

    /*
     * return all employees in the database, used optional container so it
     * gracefully
     * deals with when there is null.
     */
    List<EmployeeResponseDto> getAllEmployees();

    /*
     * find employee by email
     */
    EmployeeResponseDto getEmployeeByEmail(String email);

    /*
     * update employee through the id field
     */
    EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto dto);

    /*
     * delete an employee by id
     */
    void deleteEmployee(Long id);
}
