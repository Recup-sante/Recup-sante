package fr.sebastienr.recupback.entities;

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
    @JoinColumn(name = "emprunteurId")
    private Emprunteur emprunteur;
    @ManyToOne
    @JoinColumn(name = "annonceId")
    private Annonce annonce;
    @Enumerated(EnumType.STRING)
    private EmpruntStatus statut;

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }

    public Long getEmpruntId() {
        return empruntId;
    }
}
