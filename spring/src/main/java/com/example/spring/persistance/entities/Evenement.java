package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "Event")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Evenement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_event")
    private int idEvent;
    @Column(name="nom_event")
    private String nom;
    @Column(name="date_event")

    private Date dateEvent;
    @Column(name="type_event")

    private String TypeEvent;
    @Column(name="desc_event")
    private String description;
    @ManyToMany(mappedBy = "evenements")
    private List<User> users;
}
