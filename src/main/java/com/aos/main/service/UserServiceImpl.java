package com.aos.main.service;

import com.aos.main.dao.IUserDao;
import com.aos.main.dao.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
@Service("UserServiceBean")
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("UserDaoBeanImpl1") IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
