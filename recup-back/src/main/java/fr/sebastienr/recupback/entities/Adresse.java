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
}
