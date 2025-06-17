package com.practice.springcrud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;
import com.practice.springcrud.Entity.Employee;
import com.practice.springcrud.Exception.ResourceNotFoundException;
import com.practice.springcrud.Mapper.EmployeeMapper;
import com.practice.springcrud.Repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

/*
 * this service implements the employseeservice interface
 * it is a service class and it depends on the repository
 * I will use constructor injection with RequiredArgsConstructor
 */

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    /*
     * depends on repository
     */
    private final EmployeeRepository employeeRepository;

    /*
     * now communication must be done through the mapper, not
     * directly with the entity
     */

    private final EmployeeMapper employeeMapper;
    /*
     * createuser business logic
     */

    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto dto) {
        Employee employee = employeeMapper.toEntity(dto);
        return employeeMapper.toResponseDto(employeeRepository.save(employee));
    }

    /*
     * Get employee by Id, the findbyId returns optional<T>
     */
    @Override
    public EmployeeResponseDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
        return employeeMapper.toResponseDto(employee);
        /*
         * find by Id returns Optional<Employee> incompatible with Employee
         * so we wrap with orElseThrow to counter that
         */
    }

    /*
     * find all employees
     */
    @Override
    public List<EmployeeResponseDto> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::toResponseDto)
                .toList();

        /*
         * .map(employee -> employeeMapper.toResponseDto(employee) is same as
         * the method referencing , passing lambda as an argument
         */
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto dto) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee with ID ", " not found", id));

        employeeMapper.updateExistingUserFromDto(dto, employee);
        Employee updated = employeeRepository.save(employee);

        return employeeMapper.toResponseDto(updated);
    }

}
