package com.signify.onlinecontactmanagementsystem.services;

import com.signify.onlinecontactmanagementsystem.customexceptions.UserNotFoundException;
import com.signify.onlinecontactmanagementsystem.entity.User;
import com.signify.onlinecontactmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(String userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("User with id " + userId + " not found");
        }
        return optionalUser.get();
    }

    @Override
    public User updateUser(String userId, User user) {
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("User with id " + userId + " not found");
        }

        User userDoc = optionalUser.get();

        if (Objects.nonNull(user.getUserName()) && !"".equalsIgnoreCase(user.getUserName())) {
            userDoc.setUserName(user.getUserName());
        }

        if (Objects.nonNull(user.getPhoneNumber()) && !"".equalsIgnoreCase(user.getPhoneNumber())) {
            userDoc.setPhoneNumber(user.getPhoneNumber());
        }

        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
            userDoc.setEmail(user.getEmail());
        }

        return userRepository.save(userDoc);
    }

    @Override
    public String deleteUser(String userId) {
        if (!userRepository.existsById(userId)) {
            throw new UserNotFoundException("User with id " + userId + " not found");
        }
        userRepository.deleteById(userId);
        return "Deleted user with id: " + userId;
    }
}