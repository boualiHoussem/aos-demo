package com.aos.main.controller;

import com.aos.main.dao.entities.User;
import com.aos.main.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }

    // http://fdfdf.dfdf/findByName?name=dfdf
    @GetMapping("/findByName")
    public User findUserByName(@RequestParam String name) {
        return userService.findUserByName(name);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
