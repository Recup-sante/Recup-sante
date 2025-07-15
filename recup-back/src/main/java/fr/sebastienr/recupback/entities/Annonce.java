package fr.sebastienr.recupback.entities;

import jakarta.persistence.*;

@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long annonceId;
    private String title;
    private String description;
    private String image;
    private String ville;
    private String categorie;
    private Boolean archive;
    @ManyToOne
    @JoinColumn(name = "associationId")
    private Association association;

    public void setAnnonceId(Long annonceId) {
        this.annonceId = annonceId;
    }

    public Long getAnnonceId() {
        return annonceId;
    }
}
