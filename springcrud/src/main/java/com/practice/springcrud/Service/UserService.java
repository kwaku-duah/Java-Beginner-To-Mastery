package com.practice.springcrud.Service;

import java.util.List;

import com.practice.springcrud.Entity.User;

/*
 * this is the service interface layer of the application
 * interfaces simply dictates to some extent what must be done without
 * attaching how it must be done
 * In here, I will add what I think must be done and go over in the userserviceimpl
 * class to do them
 */


public interface UserService {

    /*create user that takes an object of 
    type user and returns User */
    User createUser(User user);

    /*get users by 
    user Id */
    User getUserById(Long userId);

    /*getting all 
    users  */
    List<User> getAllUsers();

    /*update a user with 
    new info */
    User updateUser(User user);

    /*delete a user 
    from the db
     *
     */
    void deleteUserById(Long userId);


}
