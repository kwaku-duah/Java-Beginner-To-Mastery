package com.practice.springcrud.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springcrud.Entity.User;
import com.practice.springcrud.Service.UserService;

import lombok.RequiredArgsConstructor;

/*this is the user controller
 * marked with @RestController, @Requiredargsconstructor for 
 * constructor injection of the service layer
 * 
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {
    /*
     * depends on the userservice to function, receiving http requests
     * and sending http requests
     */
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

   
}
