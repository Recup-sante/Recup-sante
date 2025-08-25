package fr.sebastienr.recupback.entities;

import jakarta.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adresseId;
    private int numero;
    private String nomRue;
    private int codePostal;
    private String ville;
    @OneToOne(cascade = CascadeType.ALL)
    private Association association;

    public Adresse() {
    }

    public Adresse(int numero, String nomRue, int codePostal, String ville) {
        this.setNumero(numero);
        this.setNomRue(nomRue);
        this.setCodePostal(codePostal);
        this.setVille(ville);
    }

    public Adresse(Long adresseId, int numero, String nomRue, int codePostal, String ville) {
        this.adresseId = adresseId;
        this.numero = numero;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public Adresse(int numero, String nomRue, int codePostal, String ville, Association association) {
        this.numero = numero;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.association = association;
    }

    public Adresse(Long adresseId, int numero, String nomRue, int codePostal, String ville, Association association) {
        this.adresseId = adresseId;
        this.numero = numero;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.association = association;
    }

    public void setAdresseId(Long adresseId) {
        this.adresseId = adresseId;
    }

    public Long getAdresseId() {
        return adresseId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "adresseId=" + adresseId +
                ", numero=" + numero +
                ", nomRue='" + nomRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", association=" + association +
                '}';
    }
}
