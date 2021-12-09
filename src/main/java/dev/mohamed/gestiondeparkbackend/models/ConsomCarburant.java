package dev.mohamed.gestiondeparkbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ConsomCarburant")
public class ConsomCarburant {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private float qtcarverse;

    @Column
    private float qtcarconsome;

    @Column
    private float kmparcouru;

    @Column
    private float mntcarverse;

    @ManyToOne
    @JoinColumn(name = "idvoiture")
    private Voiture voiture;

    @ManyToOne
    @JoinColumn(name = "idmission")
    private Mission mission;

}
