package com.practice.springcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.springcrud.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /*
     * custom methods can be defined here, for example the email and phoneNumber
     * fields are unique, it can be used to find a user to 
     * so boolean existsByEmail(String email)
     * boolean existsByPhoneNumber(String phoneNumber) 
     */
}
