package com.example.spring.persistance.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table(name="User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private int idUser;
    @Column(name="email_user")
    private String email;
    @Column(name="name_user")
    private String name;
    @Column(name="pswd_user")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    //Relation Feedback
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    //Relation Reclamation
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reclamation> reclamations;

    //Relation Evenement
    @ManyToMany
    @JoinTable(
            name = "user_event",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_event")
    )
    private List<Evenement> evenements;

    //Relation Logisitque


    //Relation Formation
}
