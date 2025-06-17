package com.practice.springcrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.springcrud.Entity.User;
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
public class UserServiceImpl implements UserService {

    /*
     * service layer depends hugely on the repository
     * user repository Field has been declared in this class
     * instead of manually creating a constructor that sets its value,
     * I have used requiredargsconstructor which will manage it for me
     */
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> getUser = userRepository.findById(userId);
        return getUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);

        return updatedUser;
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }

}
