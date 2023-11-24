package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

    public static List<User> users = new ArrayList<>();
    static int userCount=0;

    static {
        users.add(new User(userCount++, "Thania", LocalDate.now()));
        users.add(new User(userCount++, "Adam", LocalDate.now()));

        users.add(new User(userCount++, "Eve", LocalDate.now()));

    }

    public List<User> findAll(){
        return users;
    }

    
    public User findOne(int id){
        Predicate<User> user = x -> x.getId()==id;
        return users.stream().filter(user).toList().get(0);
    }

    public User save(User user){
        user.setId(userCount++);
        users.add(user);
        return user;
    }


    public void deleteUserById(int id) {
        Predicate<User> user = x -> x.getId()==id;
        users.removeIf(user);
    }

}
