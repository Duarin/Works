package com.gmail.bilvania2906.homeworks2.work19_Optional;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository.addUser(new User(1, "Ivan", "biliachok228@gmail.com"));
        UserRepository.addUser(new User(2, "Nastia", "supergirl228@gmail.com"));
        UserRepository.addUser(new User(3, "Nikita", "Nikita666@gmail.com.com"));

        int searchId = 2;
        Optional<User> userById=UserRepository.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("User found by ID "+searchId+": " + user),
                ()-> System.out.println("User with ID " + searchId + " not found.")
        );

        String searchEmail="biliachok228@gmail.com";
        Optional<User> userByEmail=UserRepository.findUserByEmail(searchEmail);
        userById.ifPresentOrElse(
                user -> System.out.println("User found by Email "+searchEmail+": " + user),
                ()-> System.out.println("User with Email " + searchEmail + " not found.")
        );

        Optional<List<User>> allUsers = UserRepository.findAllUsers();
        allUsers.ifPresentOrElse(
                users -> System.out.println("Total users: " + users.size()),
                () -> System.out.println("No users found.")
        );
    }
}
