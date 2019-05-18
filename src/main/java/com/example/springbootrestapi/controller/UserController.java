package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.entity.User;
import com.example.springbootrestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> userAllSelect() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User userOneSelect(@PathVariable("id") Long user_id) {
        return userRepository.getOne(user_id);
    }

    @PostMapping(value = "/save")
    public void userInsert(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping(value = "/update")
    public void userUpdate(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping(value = "/delete")
    public void userDelete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
