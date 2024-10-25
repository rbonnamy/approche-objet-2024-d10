package fr.diginamic.maison.generiques;

import fr.diginamic.maison.exceptions.MaisonException;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece<T extends Equipement> {

    protected double superficie;
    protected int etage;
    List<T> equipements = new ArrayList<>();

    public Piece(double superficie, int etage) {
        if (superficie > 0 && etage >= 0) {
            this.superficie = superficie;
            this.etage = etage;
        }
    }

    public void addEquipements(T... equipements){
        for (T t: equipements){
            this.equipements.add(t);
        }
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }

    public abstract String getType();


    public void setEquipements(List<T> equipements) {
        this.equipements = equipements;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
