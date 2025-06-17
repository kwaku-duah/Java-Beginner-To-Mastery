package com.practice.springcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springcrud.Entity.User;

/*
 * making interface that will communicate with the database
 * UserRepository inherits from JpaRepository class which takes an
 * entity and type of its primary key, entity is User class and id field
 * has type Long
 * 
 * this setup automatically gives out of the box CRUD methods, save(),
 * findById() and deleteById() 
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
