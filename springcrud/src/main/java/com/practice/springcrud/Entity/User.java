package com.practice.springcrud.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * First body to create is entity models
 * this entity would also be mapped to a database
 */

@Entity
@Table(name = "users_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /*
     * marked as JPA entity so reqires an Id
     * Id would be the primary field and @GeneratedValue would be
     * how the ids are generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
     * Generation type .SEQUENCE is best esp if using postgres
     * it is for big scalable apps that requires batch insertions,
     * so identity that delegates assignment of IDs to postgres
     */
    private Long id;
    /* column(nullable ensures the database does not store null) 
     * 
     * notblank and size annotation are from jarkarta validation api
     * that is used for validation before taking data to the database
     * this ensures robustness
    */

    @NotBlank(message = "First name must not be blank")
    @Size(max = 50, message = "First name must not be longer than 50 letters")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Last name must not be blank")
    @Size(max = 50, message = "Last name must not be longer than 50 letters")
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;
}
