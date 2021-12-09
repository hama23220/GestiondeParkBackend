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
@Table(name = "Voiture")
public class Voiture {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nummatricule")
    private String nummatricule ;

    @Column(name = "numchassis")
    private String numchassis;

    @Column(name = "kilometragetotale")
    private Double kilometragetotale ;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "nbplaces")
    private Integer nbplaces;

    @Column(name = "dateachat")
    private String dateachat;

    @ManyToMany
    private List<Chauffeur> chauffeurs;

    @OneToMany(mappedBy = "voiture")
    public List<ConsomCarburant> consomCarburant;

    @OneToMany(mappedBy = "voiture")
    public List<Entretien> entretiens;
}
