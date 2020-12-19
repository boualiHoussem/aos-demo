package com.aos.main.dao.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author houssem.bouali
 * @Date 12/12/2020
 */
@Data
@Entity
@Table(name = "UTILISATEUR")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "NOM", nullable = false, unique = true)
    private String name;
    private String lastName;
    private String email;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bDay;

}
