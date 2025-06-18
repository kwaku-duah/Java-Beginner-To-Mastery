package com.practice.springcrud.Controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.practice.springcrud.DTO.*;
import com.practice.springcrud.Payload.ApiResponse;
import com.practice.springcrud.Service.EmployeeService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*
 * depends on the employeeService
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    /*
     * Create Employee API endpoint
     */
    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody @Valid EmployeeRequestDto employeeDto) {
        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public ResponseEntity<EmployeeResponseDto> findEmployeeByEmail(@PathVariable String email) {
        return ResponseEntity.ok(employeeService.findByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> findEmployeeById(@PathVariable() Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> findAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(@PathVariable() Long id,
            @RequestBody @Valid EmployeeRequestDto dto) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteEmployee(@PathVariable() Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok(new ApiResponse(true, "Employee details has been removed succesfully!"));
    }
}
