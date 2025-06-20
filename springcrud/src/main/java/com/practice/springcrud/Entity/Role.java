package com.practice.springcrud.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;


/*
 * role entity where roles assigned to users are split into
 * separate tables for scalability, maintainability and spring security
 * this is a worldclass approach to programming
 */

 @Entity
 @Table(name = "employeeroles")
 @Getter
 @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private EmployeeRoleName roleName;

    /*
     * good defensive coding 
     * initializing
     */
    @ManyToMany(mappedBy = "roles")
    @Builder.Default
    private Set<Employee> employee = new HashSet<>();
}
