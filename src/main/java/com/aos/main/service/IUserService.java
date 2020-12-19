package com.aos.main.service;

import com.aos.main.dao.entities.User;

import java.util.List;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
public interface IUserService {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

    User findUserByName(String name);

    List<User> findAll();
}
