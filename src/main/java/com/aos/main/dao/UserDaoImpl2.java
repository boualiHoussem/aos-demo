package com.aos.main.dao;

import com.aos.main.dao.entities.User;
import com.aos.main.dao.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
@Repository
public class UserDaoImpl2 implements IUserDao {

    private final IUserRepository userRepository;

    @Autowired
    public UserDaoImpl2(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
