package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table(name= "Feedback")

public class Feedback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Feed")
    private int idFeed;
    @Column(name="Desc_Feed")
    private String description;
    @Column(name="Date_Feed")
    private Date dateFeed;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
