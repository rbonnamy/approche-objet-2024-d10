package fr.diginamic.maison.generiques;

public abstract class Equipement {

    private String nom;

    public Equipement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

}
