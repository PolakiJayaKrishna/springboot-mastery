package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    public String getUser(@RequestBody User user){
        return "Name: " + user.getName() + ", Age: " + user.getAge();
    }
}
