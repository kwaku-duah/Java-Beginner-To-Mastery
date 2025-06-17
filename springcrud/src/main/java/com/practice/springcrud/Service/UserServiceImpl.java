package com.practice.springcrud.Service;

import org.springframework.stereotype.Service;

import com.practice.springcrud.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

/*
 * this implements the userservice interface
 * this now goes knee deep on how the methods in the interface should be done
 * @service annotation indicates to java that this holds business logic
 * and the requiredargscontructor is better than allargscontructor here if the field
 * instantiated with it is final, it gives confidence to spring, that once that is done
 * it won't change ever again
 * 
 * method overriding refers to a subclass or implementing class(of an interface)
 * that redefines a method in its superclass or interface
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    /*service layer depends hugely on the repository 
     * user repository Field has been declared in this class
     * instead of manually creating a constructor that sets its value, 
     * I have used requiredargsconstructor which will manage it for me
    */
    private final UserRepository userRepository;

}
