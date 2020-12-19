package com.aos.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class MdwApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdwApplication.class, args);
    }

}
