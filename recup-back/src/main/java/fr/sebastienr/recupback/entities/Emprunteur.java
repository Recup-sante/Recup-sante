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
    @OneToMany(mappedBy = "emprunteur", cascade = CascadeType.ALL)
    private List<Emprunt> emprunts = new ArrayList<>();


    public Emprunteur() {
    }

    public Emprunteur(String nom, String prenom, Adresse adresse, String email, String telephone, List<Emprunt> emprunts) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.emprunts = emprunts;
    }

    public Emprunteur(Long emprunteurId, String nom, String prenom, Adresse adresse, String email, String telephone, List<Emprunt> emprunts) {
        this.emprunteurId = emprunteurId;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.emprunts = emprunts;
    }

    public void setEmprunteurId(Long emprunteurId) {
        this.emprunteurId = emprunteurId;
    }

    public Long getEmprunteurId() {
        return emprunteurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Emprunteur{" +
                "emprunteurId=" + emprunteurId +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", emprunts=" + emprunts +
                '}';
    }
}
