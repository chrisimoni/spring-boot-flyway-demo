package com.chrisimoni.springbootflywayjpademo.service;

import com.chrisimoni.springbootflywayjpademo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(long userId);

    User updateUser(long userId, User user);

    void deleteUser(long userId);
}
