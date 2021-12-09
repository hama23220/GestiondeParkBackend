package dev.mohamed.gestiondeparkbackend.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Chauffeur")
public class Chauffeur{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private Integer nom ;

    @Column(name = "prenom")
    private Integer prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @ManyToMany
    private List<Voiture> voitures;
}
