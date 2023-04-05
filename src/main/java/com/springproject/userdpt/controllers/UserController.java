package com.springproject.userdpt.controllers;

import com.springproject.userdpt.entities.User;
import com.springproject.userdpt.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    /** buscar todos os usuarios */
    @GetMapping
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    /** buscar um usuario pelo seu id */
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    /** salvar um novo usuario */
    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
