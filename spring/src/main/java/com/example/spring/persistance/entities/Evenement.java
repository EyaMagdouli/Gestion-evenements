package com.example.spring.persistance.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;

    private String nom;
    private Date dateEvent;
    private String TypeEvent;
    private String description;
}
