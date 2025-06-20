package com.practice.springcrud.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springcrud.Entity.User;
import com.practice.springcrud.Service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

/*this is the user controller
 * marked with @RestController, @Requiredargsconstructor for 
 * constructor injection of the service layer
 * 
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {
    /*
     * depends on the userservice to function, receiving http requests
     * and sending http requests
     */
    private final UserService userService;

    /*@Valid annotation on the user object, because it has validation on
     * it in the entity class to enforce it, 
     * always handle validation at the controller level, to prevent it from 
     * getting to the service
     */
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{userId}") //cleanly using same name as method parameter to avoid putting a value in pathvariable
    public ResponseEntity<User> getUserById(@PathVariable() Long userId) {
        User fetchUser = userService.getUserById(userId);
        return new ResponseEntity<>(fetchUser, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> fetchAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PutMapping("{userId}")
    public ResponseEntity<User> updateUser(
            @PathVariable() Long userId,
            @RequestBody @Valid User user) {
        user.setId(userId);
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable() Long userId) {
        userService.deleteUserById(userId);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }
}
