package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table (name= "Logistique")

public class Logistique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_log")
    private int idLog;
    @Column(name="nom_log")

    private String NomLog;
    @Column(name="type_log")
    private String TypeLog;

    //Relation avec le user

}
