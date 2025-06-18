package com.practice.springcrud.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.practice.springcrud.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceHandleNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(new ApiResponse(false, ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnAuthorizedException.class)
    public ResponseEntity<ApiResponse> UnAuthorizedException(UnAuthorizedException ex) {
        return new ResponseEntity<>(new ApiResponse(false, "You are not authorized"), HttpStatus.FORBIDDEN);
    }
}
