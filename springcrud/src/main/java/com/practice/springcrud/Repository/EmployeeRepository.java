package com.practice.springcrud.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.springcrud.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /*
     * custom methods can be defined here, for example the email and phoneNumber
     * fields are unique, it can be used to find a user to 
     * so boolean existsByEmail(String email)
     * boolean existsByPhoneNumber(String phoneNumber) 
     */
    //unique fields, so best use is Optional container, returns one or gracefull error handling
    Optional<Employee> findByEmail(String email);

    /*
     * composite check to handle duplication errors
     */
    boolean existsByEmailOrPhoneNumber(String email, String phoneNumber);
}
