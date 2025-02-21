package com.sachin.service;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
        private List<User> users = new ArrayList<>();

        public void registerUser(User user) throws CabException {
            if (user.name.isEmpty() || user.email.isEmpty() || user.phone.isEmpty()) {
                throw new CabException("User details cannot be empty!");
            }
            users.add(user);
            System.out.println("User registered successfully.");
        }

        public void displayUsers() {
            for (User user : users) {
                user.displayUser();
            }
        }
    }

