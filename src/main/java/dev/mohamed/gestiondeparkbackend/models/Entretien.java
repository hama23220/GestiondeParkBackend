package dev.mohamed.gestiondeparkbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Entretien")
public class Entretien {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "type")
    private Integer type;

    @Column(name = "pieces")
    private Integer pieces;

    @Column(name = "dateentretien")
    private String dateentretien;

    @Column(name = "kilodevidange", nullable = true)
    private Double kilodevidange;

    @Column(name = "prix")
    private Double prix;

    @ManyToOne
    private Voiture voiture;
}
