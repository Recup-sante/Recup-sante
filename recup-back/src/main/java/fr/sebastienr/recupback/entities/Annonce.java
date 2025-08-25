package fr.sebastienr.recupback.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @JoinColumn(name = "annonce-id")
    private Association association;
    @OneToMany(mappedBy = "annonce", cascade = CascadeType.ALL)
    private List<Emprunt> emprunts = new ArrayList<>();

    public Annonce() {
    }

    public Annonce(String title, String description, String image, String ville, String categorie, Boolean archive, Association association, List<Emprunt> emprunts) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.ville = ville;
        this.categorie = categorie;
        this.archive = archive;
        this.association = association;
        this.emprunts = emprunts;
    }

    public Annonce(Long annonceId, String title, String description, String image, String ville, String categorie, Boolean archive, Association association, List<Emprunt> emprunts) {
        this.annonceId = annonceId;
        this.title = title;
        this.description = description;
        this.image = image;
        this.ville = ville;
        this.categorie = categorie;
        this.archive = archive;
        this.association = association;
        this.emprunts = emprunts;
    }

    public void setAnnonceId(Long annonceId) {
        this.annonceId = annonceId;
    }

    public Long getAnnonceId() {
        return annonceId;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Annonce{" +
                "annonceId=" + annonceId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", ville='" + ville + '\'' +
                ", categorie='" + categorie + '\'' +
                ", archive=" + archive +
                ", association=" + association +
                ", emprunts=" + emprunts +
                '}';
    }
}
