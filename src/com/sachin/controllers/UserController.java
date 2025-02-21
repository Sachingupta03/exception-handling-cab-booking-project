package com.sachin.controllers;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.User;
import com.sachin.service.UserService;

public class UserController {
    private final UserService userService = new UserService();

    public void registerUser(int id, String name, String email, String phone, String address) {
        try {
            User user = new User(id, name, email, phone, address);
            userService.registerUser(user);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("User registration Successfully completed.");
        }
    }

    public void displayUsers() {
        userService.displayUsers();
    }
}

