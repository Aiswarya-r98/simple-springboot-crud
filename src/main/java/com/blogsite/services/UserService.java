package com.blogsite.services;


import com.blogsite.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    List<User> getUsers();

    User getUserByEmail(String email);
}
