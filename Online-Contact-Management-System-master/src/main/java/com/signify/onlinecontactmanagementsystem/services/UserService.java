package com.signify.onlinecontactmanagementsystem.services;

import com.signify.onlinecontactmanagementsystem.entity.User;

public interface UserService {
    User createUser(User user);

    User getUser(String userId);

    User updateUser(String userId, User user);

    String deleteUser(String userId);
}
