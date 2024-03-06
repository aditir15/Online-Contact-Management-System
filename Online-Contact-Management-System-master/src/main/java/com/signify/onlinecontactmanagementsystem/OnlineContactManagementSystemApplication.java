package com.signify.onlinecontactmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class OnlineContactManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineContactManagementSystemApplication.class, args);
    }

}
