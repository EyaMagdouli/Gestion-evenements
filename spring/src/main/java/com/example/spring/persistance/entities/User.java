package com.example.spring.persistance.entities;


import javax.persistence.*;
import java.io.Serializable;
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String email;
    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;


}
