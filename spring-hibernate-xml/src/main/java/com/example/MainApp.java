package com.example;

import com.example.config.AppConfig;
import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Initialize the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the UserDao bean from the context
        UserDao userDao = context.getBean(UserDao.class);
/*

        // Create and save a new user
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        userDao.save(user);
        System.out.println("User saved: " + user.getId());

        // Retrieve the user by ID
        User retrievedUser = userDao.findById(user.getId());
        System.out.println("User retrieved: " + retrievedUser.getName() + " - " + retrievedUser.getEmail());

        // Update the user's email
        retrievedUser.setEmail("john.new@example.com");
        userDao.update(retrievedUser);
        System.out.println("User updated: " + userDao.findById(user.getId()).getEmail());
*/

        // Retrieve all users
        System.out.println("All users:");
        for (User u : userDao.findAll()) {
            System.out.println(u.getId() + ": " + u.getName() + " - " + u.getEmail());
        }
/*
        // Delete the user
        userDao.delete(user.getId());
        System.out.println("User deleted.");

        // Verify deletion
        if (userDao.findById(user.getId()) == null) {
            System.out.println("User successfully deleted.");
        }*/
    }
}
