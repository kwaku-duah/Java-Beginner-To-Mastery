package com.practice.springcrud.Entity;

/*
 * employee roles design
 * cleaner worldclass way to use this is to append ROLE_ to it and 
 * use hasRole, instead of custom overrides that may need hasAuthority
 * For best approach, use ROLE_ and append role to it
 */

public enum EmployeeRoleName {
    ROLE_ADMIN,
    ROLE_EXECUTIVE,
    ROLE_THIRDPARTY
}
