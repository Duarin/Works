package com.gmail.bilvania2906.homeworks2.work19_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static Optional<User> findUserById(int id){
        return users.stream()
                .filter(user -> user.getId()==id)
                .findFirst();
    }
    public static Optional<User> findUserByEmail(String email){
        return users.stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

    public static Optional<List<User>> findAllUsers(){
        return users.isEmpty()?Optional.empty():Optional.of(users);
    }

}
