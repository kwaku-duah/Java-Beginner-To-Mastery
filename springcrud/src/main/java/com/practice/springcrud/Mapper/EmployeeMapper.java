package com.practice.springcrud.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.practice.springcrud.DTO.EmployeeRequestDto;
import com.practice.springcrud.DTO.EmployeeResponseDto;
import com.practice.springcrud.DTO.PartialEmployeeRequestDto;
import com.practice.springcrud.Entity.Employee;

/*
 * mapper class or interface is responsible for converting between 
 * two different layers of objects
 * 
 * clearly explained here -> there is entity ----> dto 
 * select fields from entity that should goto dto
 * 
 * and then there is Dto receiving a request that must be translated atop 
 * an entity
 * so simply entity to response dtoresponse and 
 * request dto translation to an entity
 */

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    /*
     * this method takes an employeerequest returns an employee object
     * created from employee entity
     * 
     * @Mapping annotation takes away a warning in java
     */
    @Mapping(target = "id" , ignore = true)
    @Mapping(target = "status", ignore = true)
    Employee toEntity(EmployeeRequestDto dto);

    /*
     * takes an employee object (entity and then
     * returns only fields defined in the response)
     */

    EmployeeResponseDto toResponseDto(Employee employee);

    /*
     * records dont work well with partial data, for existing fields, if you
     * updating it, to prevent the writeup to overrite already parts with
     * null, you must add the annotaion nullValuePropertyMappingStrategy
     * 
     * when partial data comes from the dto,with some null, this helps it to skip it
     * and preserve the old data
     */

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    Employee toPartialDto(PartialEmployeeRequestDto dto);

    /*
     * EmployeeRequestDto already have validation annotations for fields like
     * notblank , size so, it won't reach this section
     * 
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    void updateExistingUserFromDto(EmployeeRequestDto dto, @MappingTarget Employee employee);

    /*
     * There is no validation for the for the partialemployeerequestdto
     * this allows passed data to reach this method and then from the source if
     * there
     * are fields with null, the BeanMapping simply instructs mapstruct to not
     * replace
     * the existing fields with null
     */
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", ignore = true)
    void partialEmployeeFromDto(PartialEmployeeRequestDto dto, @MappingTarget Employee employee);
}

// this binds the entity to the DTO