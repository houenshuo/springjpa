package com.example.springjpa.controller;

import com.example.springjpa.entity.User;
import com.example.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "/save")
    public void userSave(@RequestParam String name,@RequestParam String email){
        User user =new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
    }
}
