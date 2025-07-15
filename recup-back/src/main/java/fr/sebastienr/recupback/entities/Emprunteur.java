package fr.sebastienr.recupback.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Emprunteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emprunteurId;
    private String nom;
    private String prenom;
    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;
    private String email;
    private String telephone;

    private List<Emprunt> emprunts = new ArrayList<>();

    public void setEmprunteurId(Long emprunteurId) {
        this.emprunteurId = emprunteurId;
    }

    public Long getEmprunteurId() {
        return emprunteurId;
    }
}
