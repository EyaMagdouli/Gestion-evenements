package com.example.spring.persistance.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForm;

    private String nom;
    private Date dateForm;
    private String TypeForm;
}
