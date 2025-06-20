package com.practice.springcrud.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.springcrud.Entity.EmployeeRoleName;
import com.practice.springcrud.Entity.Role;
import com.practice.springcrud.Repository.RoleRepository;

import lombok.RequiredArgsConstructor;

/*
 * automatically seeding roles once springboot runs
 */

@Component
@RequiredArgsConstructor 
public class RoleSeeder implements CommandLineRunner {

    
    /*
     * constructor injection
     */
    private final RoleRepository roleRepository;

    public void run(String... args) {
        for (EmployeeRoleName employeeRoleName: EmployeeRoleName.values()) {
            if (!roleRepository.existsByRoleName(employeeRoleName)) {
                Role role = Role.builder()
                    .roleName(employeeRoleName)
                    .build();
            roleRepository.save(role);

            System.out.println("Seeded role " + employeeRoleName);
                    
            }
        } System.out.println("All Roles Already Seeded");
    }

}
