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
@RequestMapping("api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    /*
     * Create Employee API endpoint
     */
    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(@RequestBody @Valid EmployeeRequestDto employeeDto) {
        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
    }

    @PostMapping("/executive")
    public ResponseEntity<EmployeeResponseDto> createEmployeeExecutive(@RequestBody @Valid EmployeeRequestDto dto) {
        return new ResponseEntity<>(employeeService.createExecutive(dto), HttpStatus.CREATED);
    }

    @PostMapping("/third-party")
    public ResponseEntity<EmployeeResponseDto> createThirdPartyEmployee(@RequestBody @Valid EmployeeRequestDto dto) {
        return new ResponseEntity<>(employeeService.createThirdParty(dto), HttpStatus.CREATED);
    }

    @GetMapping("/email/{email}")
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

    /*
     * patch mapping has flexibility of updating part of a resource
     * put resources updates whole resource
     */
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeResponseDto> partialEmployeeUpdate(@PathVariable Long id,
            @RequestBody PartialEmployeeRequestDto dto) {
        return ResponseEntity.ok(employeeService.partialUpdate(id, dto));
    }

    /*
     * implementation of REST API endpoint for softdelete
     * following world class practices
     */
    @DeleteMapping("/soft-delete/{id}")
    public ResponseEntity<ApiResponse> softEmployeeDelete(@PathVariable Long id) {
        employeeService.softDelete(id);
        return ResponseEntity.ok(new ApiResponse(true, "Employee Successfully removed"));
    }
}
