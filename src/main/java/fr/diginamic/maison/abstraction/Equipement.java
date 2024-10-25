package fr.diginamic.maison.abstraction;

public abstract class Equipement {

    private String nom;

    public Equipement(String nom) {
        this.nom = nom;
    }

    public abstract TypeEquipement getType();

    public String getNom() {
        return nom;
    }
}
