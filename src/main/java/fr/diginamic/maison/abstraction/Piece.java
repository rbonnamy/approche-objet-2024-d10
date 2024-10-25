package fr.diginamic.maison.abstraction;

import fr.diginamic.maison.exceptions.MaisonException;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected double superficie;
    protected int etage;
    List<Equipement> equipements = new ArrayList<>();

    public Piece(double superficie, int etage) {
        if (superficie > 0 && etage >= 0) {
            this.superficie = superficie;
            this.etage = etage;
        }
    }

    public void addEquipements(Equipement... equipements) throws MaisonException {
        for (Equipement equ: equipements){
            if (isEquipementCorrect(equ)) {
                this.equipements.add(equ);
            }
            else {
                throw new MaisonException("Vous ne pouvez pas ajouter un équipement de type "+equ.getType()+" dans une pièce de type "+getType());
            }
        }
    }

    abstract boolean isEquipementCorrect(Equipement equ);

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }

    public abstract String getType();

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
