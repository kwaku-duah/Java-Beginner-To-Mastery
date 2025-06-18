package com.practice.springcrud.Exception;


/*
 * creating an exception
 */

public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(String message) {
        super(message);
    }
}
