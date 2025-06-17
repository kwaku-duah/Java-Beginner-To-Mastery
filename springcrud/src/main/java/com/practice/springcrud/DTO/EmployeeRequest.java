package com.practice.springcrud.DTO;

import jakarta.validation.constraints.*;

/*
 * record is good because it does automatic contructors and getters
 * it does not have setters, good for POST, PUT requests that comes with full
 * data or it does not work well with partial data
 * immutable and canonical constructors
 * 
 * since I will be passing this to the controller, I will need to add the validation 
 * here
 * instead of the entity because this is what will be passed to the controller layer
 */

public record EmployeeRequest(

    @NotBlank(message = "You must provide a first name")
    @Size(max = 50, message = "First Name must be max 50 characters")
    String firstName,


    @NotBlank(message = "You must provide a last name")
    @Size(max = 50, message = "Last Name must be max = 50 characters")
    String lastName,

    @NotBlank(message = "You must provide an email")
    @Email(message = "Provide a valid email format")
    String email,


    @NotNull(message = "Enter starting salary")
    @DecimalMin(value = "0.0", inclusive = false, message = "Salary cannot be 0")
    @Digits(integer = 10, fraction = 2, message = "Salary must be up to two decimals")
    Double salary,

    @NotBlank(message = "Please provide a phone number")
    @Pattern(regexp = "^(233|0)[0-9]{9}$", message = "Your phone number must start with 233 or 0 and followed by 9 numbers")
    String phoneNumber
) {}   

