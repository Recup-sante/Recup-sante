package fr.sebastienr.recupback.entities;

import fr.sebastienr.recupback.enums.AssociationStatus;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long associationId;
    private String associationName;
    private String associationEmail;
    private String associationPassword;
    private String associationRole = "USER";
    private String associationDescription;
    private Boolean active;
    @OneToMany(mappedBy = "association",  cascade = CascadeType.ALL)
    private List<Annonce> annonces = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private AssociationStatus statut;// en_attente, validee, refusee
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresseId", referencedColumnName = "adresseId")
    private Adresse adresse;

    public Association() {
    }

    public Association(String associationName, String associationEmail, String associationPassword, String associationRole, String associationDescription, Boolean active, List<Annonce> annonces, AssociationStatus statut,  Adresse adresse) {
        this.setAssociationName(associationName);
        this.setAssociationEmail(associationEmail);
        this.setAssociationPassword(associationPassword);
        this.setAssociationRole(associationRole);
        this.setAssociationDescription(associationDescription);
        this.setActive(active);
        this.setAnnonces(annonces);
        this.setStatut(statut);
        this.setAdresse(adresse);
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getAssociationEmail() {
        return associationEmail;
    }

    public void setAssociationEmail(String associationEmail) {
        this.associationEmail = associationEmail;
    }

    public String getAssociationPassword() {
        return associationPassword;
    }

    public void setAssociationPassword(String associationPassword) {
        this.associationPassword = associationPassword;
    }

    public String getAssociationRole() {
        return associationRole;
    }

    public void setAssociationRole(String associationRole) {
        this.associationRole = associationRole;
    }

    public String getAssociationDescription() {
        return associationDescription;
    }

    public void setAssociationDescription(String associationDescription) {
        this.associationDescription = associationDescription;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces(List<Annonce> annonces) {
        this.annonces = annonces;
    }

    public AssociationStatus getStatut() {
        return statut;
    }

    public void setStatut(AssociationStatus statut) {
        this.statut = statut;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Association{" +
                "associationId=" + getAssociationId() +
                ", associationName='" + getAssociationName() + '\'' +
                ", associationEmail='" + getAssociationEmail() + '\'' +
                ", associationPassword='" + getAssociationPassword() + '\'' +
                ", associationRole='" + getAssociationRole() + '\'' +
                ", associationDescription='" + getAssociationDescription() + '\'' +
                ", active=" + getActive() +
                ", annonces=" + getAnnonces() +
                ", statut=" + getStatut() + '\'' +
                ", adresse=" + getAdresse() +
                '}';
    }
}
