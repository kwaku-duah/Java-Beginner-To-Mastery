package com.practice.springcrud.DTO;

/*
 * creating a DTO specially without validation check fields , so partial 
 * update for data becomes possible with patchmapping request
 * to reach this point, you must have already created the data, so without validation
 * it wont hurt, it would just match with existing fields and replace only datafields
 * that come with the new data and if a field is null, it won't alter an existing field
 * 
 */
public record PartialEmployeeRequestDto(
    String firstName,
    String lastName,
    String email,
    Double salary,
    String phoneNumber) {
}
