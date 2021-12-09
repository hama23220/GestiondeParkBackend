package dev.mohamed.gestiondeparkbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Manager")
public class Manager{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private Integer nom ;

    @Column(name = "prenom")
    private Integer prenom;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
