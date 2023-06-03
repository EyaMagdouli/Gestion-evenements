package com.example.spring.persistance.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Logistique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLog;

    private String NomLog;
    private String TypeLog;

}
