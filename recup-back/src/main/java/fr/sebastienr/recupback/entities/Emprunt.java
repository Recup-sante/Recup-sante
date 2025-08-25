package fr.sebastienr.recupback.entities;

import fr.sebastienr.recupback.enums.EmpruntStatut;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empruntId;
    private LocalDate dateDebut;
    private LocalDate dateFinPrevue;
    private LocalDate dateRetourEffective;
    @ManyToOne
    @JoinColumn(name = "emprunteur-id")
    private Emprunteur emprunteur;
    @ManyToOne
    @JoinColumn(name = "annonceId")
    private Annonce annonce;
    @Enumerated(EnumType.STRING)
    private EmpruntStatut statut;

    public Emprunt() {
    }

    public Emprunt(LocalDate dateDebut, LocalDate dateFinPrevue, LocalDate dateRetourEffective, Emprunteur emprunteur, Annonce annonce, EmpruntStatut statut) {
        this.dateDebut = dateDebut;
        this.dateFinPrevue = dateFinPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.emprunteur = emprunteur;
        this.annonce = annonce;
        this.statut = statut;
    }

    public Emprunt(Long empruntId, LocalDate dateDebut, LocalDate dateFinPrevue, LocalDate dateRetourEffective, Emprunteur emprunteur, Annonce annonce, EmpruntStatut statut) {
        this.empruntId = empruntId;
        this.dateDebut = dateDebut;
        this.dateFinPrevue = dateFinPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.emprunteur = emprunteur;
        this.annonce = annonce;
        this.statut = statut;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public EmpruntStatut getStatut() {
        return statut;
    }

    public void setStatut(EmpruntStatut statut) {
        this.statut = statut;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce(Annonce annonce) {
        this.annonce = annonce;
    }

    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    public LocalDate getDateRetourEffective() {
        return dateRetourEffective;
    }

    public void setDateRetourEffective(LocalDate dateRetourEffective) {
        this.dateRetourEffective = dateRetourEffective;
    }

    public LocalDate getDateFinPrevue() {
        return dateFinPrevue;
    }

    public void setDateFinPrevue(LocalDate dateFinPrevue) {
        this.dateFinPrevue = dateFinPrevue;
    }

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }

    public Long getEmpruntId() {
        return empruntId;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "empruntId=" + empruntId +
                ", dateDebut=" + dateDebut +
                ", dateFinPrevue=" + dateFinPrevue +
                ", dateRetourEffective=" + dateRetourEffective +
                ", emprunteur=" + emprunteur +
                ", annonce=" + annonce +
                ", statut=" + statut +
                '}';
    }
}
