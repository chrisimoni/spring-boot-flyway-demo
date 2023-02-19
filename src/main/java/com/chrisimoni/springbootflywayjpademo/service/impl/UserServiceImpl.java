package com.chrisimoni.springbootflywayjpademo.service.impl;

import com.chrisimoni.springbootflywayjpademo.model.User;
import com.chrisimoni.springbootflywayjpademo.repository.UserRepository;
import com.chrisimoni.springbootflywayjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User updateUser(long userId, User user) {
        //Allow user to update their firstname and lastname
        User userObj = userRepository.findById(userId).get();
        if (Objects.nonNull(user.getFirstName())
                && !"".equalsIgnoreCase(
                user.getFirstName())) {
            userObj.setFirstName(user.getFirstName());
        }

        if (Objects.nonNull(user.getLastName())
                && !"".equalsIgnoreCase(
                user.getLastName())) {
            userObj.setLastName(user.getLastName());
        }

        return userRepository.save(userObj);
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}
