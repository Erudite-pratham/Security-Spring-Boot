package com.example.Security.services;

import com.example.Security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService(){
        list.add(new User("abc","abc","ABC@GMAIL.COM"));
        list.add(new User("xyz","xyz","XYZ@GMAIL.COM"));
    }

    public  List<User> getAllUsers(){
        return  this.list;
    }

    public User getUser(String username){
         return  this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
