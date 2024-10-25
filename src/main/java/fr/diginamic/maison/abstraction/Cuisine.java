package fr.diginamic.maison.abstraction;

public class Cuisine extends Piece {

    public Cuisine(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "Cuisine";
    }

    @Override
    boolean isEquipementCorrect(Equipement equ) {
        return equ.getType().equals(TypeEquipement.CUISINE);
    }
}
