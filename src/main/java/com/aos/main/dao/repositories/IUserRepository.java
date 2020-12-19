package com.aos.main.dao.repositories;

import com.aos.main.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
public interface IUserRepository extends JpaRepository<User, Integer> {


    User findByName(String name);
}
