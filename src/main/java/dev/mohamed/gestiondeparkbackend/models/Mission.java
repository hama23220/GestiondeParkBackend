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
@Table(name = "Mission")
public class Mission {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "lieudedepart")
    private String lieudedepart;

    @Column(name = "lieudarrivé")
    private String lieudarrivé;

    @Column(name = "chargesurvehicule")
    private String chargesurvehicule;

    @OneToMany(mappedBy = "mission")
    private List<ConsomCarburant> consomCarburants;
}
