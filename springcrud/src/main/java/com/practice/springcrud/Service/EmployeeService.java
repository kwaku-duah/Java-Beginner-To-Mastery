package com.practice.springcrud.Service;

import java.util.List;
import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;
import com.practice.springcrud.DTO.PartialEmployeeRequestDto;

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
     * update employee through the id field
     */
    EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto dto);

    /*
     * delete an employee by id
     */
    void deleteEmployee(Long id);

    /*
     * find employee by email, interface addition
     */
    EmployeeResponseDto findByEmail(String email);

    /*partial update of employee
     * with only some data and not all
     */
    EmployeeResponseDto partialUpdate(Long id, PartialEmployeeRequestDto dto);
}
