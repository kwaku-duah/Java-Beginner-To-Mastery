package com.practice.springcrud.Exception;

/*
 * creating an exception to handle unique resource exceptions
 */

public class DuplicateResourceException extends RuntimeException {
    public DuplicateResourceException(String message) {
        super(String.format("%s", message));
    }
}
