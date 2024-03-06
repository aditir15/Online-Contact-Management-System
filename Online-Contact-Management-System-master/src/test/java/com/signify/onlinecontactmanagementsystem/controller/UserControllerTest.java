package com.signify.onlinecontactmanagementsystem.controller;

import com.signify.onlinecontactmanagementsystem.entity.User;
import com.signify.onlinecontactmanagementsystem.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserService userService;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setUserName("Rick Astley");
        user.setPhoneNumber("1234567890");
        user.setEmail("rick.astley@gmail.com");
    }

    @Test
    public void testCreateUser() throws Exception {
        mockMvc.perform(post("/api/v1/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"userName\": \"Rick Astley\", \"phoneNumber\": \"1234567890\", \"email\": \"rick.astley@gmail.com\" }"))
                .andExpect(status().isOk());
    }

}