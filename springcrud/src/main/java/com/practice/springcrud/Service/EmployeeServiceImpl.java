package com.practice.springcrud.Service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;
import com.practice.springcrud.DTO.PartialEmployeeRequestDto;
import com.practice.springcrud.Entity.*;
import com.practice.springcrud.Entity.EmployeeRoleName;
import com.practice.springcrud.Entity.EmployeeStatus;
import com.practice.springcrud.Exception.DuplicateResourceException;
import com.practice.springcrud.Exception.ResourceNotFoundException;
import com.practice.springcrud.Mapper.EmployeeMapper;
import com.practice.springcrud.Repository.EmployeeRepository;
import com.practice.springcrud.Repository.RoleRepository;

import jakarta.transaction.Transactional;
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


    /* role assignment 
     * 
     */

    private final RoleRepository roleRepository;
    /*
     * createuser business logic,  error handling logic
     */

    @Override
    public EmployeeResponseDto createExecutive(EmployeeRequestDto dto) {
        if (employeeRepository.existsByEmailOrPhoneNumber(dto.email(), dto.phoneNumber())) {
            throw new DuplicateResourceException("Email or phone number already exists");
        }

        Employee employee = employeeMapper.toEntity(dto);

        Role executiveRole = roleRepository.findByRoleName(EmployeeRoleName.ROLE_EXECUTIVE)
            .orElseThrow(() -> new ResourceNotFoundException("Role", "name", EmployeeRoleName.ROLE_EXECUTIVE));

        employee.setRoles(Set.of(executiveRole));

        return employeeMapper.toResponseDto(employeeRepository.save(employee));

    }


     /*
      * role repository to fully assign roles at the backend

      */

    @Override
    public EmployeeResponseDto createThirdParty(EmployeeRequestDto dto) {
        if (employeeRepository.existsByEmailOrPhoneNumber(dto.email(), dto.phoneNumber())) {
            throw new DuplicateResourceException("Email or Phone number already exists");
        }

        Employee employee = employeeMapper.toEntity(dto);

        Role thirdPartyRole = roleRepository.findByRoleName(EmployeeRoleName.ROLE_THIRDPARTY)
            .orElseThrow(()-> new ResourceNotFoundException("Role", "name", EmployeeRoleName.ROLE_THIRDPARTY));
    
        employee.setRoles(Set.of(thirdPartyRole));

        return employeeMapper.toResponseDto(employeeRepository.save(employee));
    }


    
    @Override
    public EmployeeResponseDto createEmployee(EmployeeRequestDto dto) {
        
        if (employeeRepository.existsByEmailOrPhoneNumber(dto.email(), dto.phoneNumber())) {
            throw new DuplicateResourceException("Email or phone number already exists");
        }


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

    /* not efficient, multiple db hits */
    // @Override
    // public void deleteEmployee(Long id) {
    // if (!employeeRepository.existsById(id)) {
    // throw new ResourceNotFoundException("Employee", "ID", id);
    // }
    // employeeRepository.deleteById(id);
    // }

    /*
     * always prioritize one db hit, if more than hit, I should add @Transaction
     * annotation
     * this also perfectly handles error gracefully
     * 
     */

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Deleted", "id", id));

        employeeRepository.delete(employee);
    }

    /*
     * soft delete business logic, find the employee by id
     * then sets their field to deleted,
     * more than one database call, so using @transaction
     */
    @Override
    @Transactional
    public void softDelete(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "with ", id));

        employee.setStatus(EmployeeStatus.DELETED);
        employeeRepository.save(employee);
    }

    @Override
    public EmployeeResponseDto updateEmployee(Long id, EmployeeRequestDto dto) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee with ID ", " not found", id));

        employeeMapper.updateExistingUserFromDto(dto, employee);
        Employee updated = employeeRepository.save(employee);

        return employeeMapper.toResponseDto(updated);
    }

    /*
     * find employee by email
     */
    @Override
    public EmployeeResponseDto findByEmail(String email) {
        Employee employee = employeeRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Employee with email", "email", email));
        return employeeMapper.toResponseDto(employee);
    }

    /*
     * partial update of data
     */

    @Override
    public EmployeeResponseDto partialUpdate(Long id, PartialEmployeeRequestDto dto) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "ID", id));

        employeeMapper.partialEmployeeFromDto(dto, employee);
        Employee partialEmployeeUpdate = employeeRepository.save(employee);

        return employeeMapper.toResponseDto(partialEmployeeUpdate);
    }

}
