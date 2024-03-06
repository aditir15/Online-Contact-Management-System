package com.signify.onlinecontactmanagementsystem.aspect;

import com.signify.onlinecontactmanagementsystem.entity.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.signify.onlinecontactmanagementsystem.controller.UserController.createUser(..))")
    public void createUserPointcut() {}

    @Pointcut("execution(* com.signify.onlinecontactmanagementsystem.controller.UserController.updateUser(..))")
    public void updateUserPointcut() {}

    @AfterReturning(pointcut = "createUserPointcut()", returning = "result")
    public void afterUserCreated(User result) {
        System.out.println("User created: " + result);
    }

    @AfterReturning(pointcut = "updateUserPointcut()", returning = "result")
    public void afterUserUpdated(User result) {
        System.out.println("User updated: " + result);
    }

    @Before("updateUserPointcut()")
    public void beforeUserUpdated(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        User user = (User) args[1];
        System.out.println("Updating user: " + user);
    }
}