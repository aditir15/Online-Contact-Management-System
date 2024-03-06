package com.signify.onlinecontactmanagementsystem.repository;

import com.signify.onlinecontactmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
