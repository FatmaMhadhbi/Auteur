package Auteur.ms.Auteur.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.Setter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="auteur")
public class Auteur {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "montant")
    private Double montant;

    @Column(name = "type")
    private String type;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "nomClient")
    private String nomClient;

    @Column(name = "nbAchat")
    private Integer nbAchat;

}