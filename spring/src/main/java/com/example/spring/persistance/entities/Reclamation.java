package com.example.spring.persistance.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRec;

    private String description;
    private Date dateRec;
    private String typeRec;
}
