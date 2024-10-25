package fr.diginamic.maison.abstraction;

public class Salon extends Piece {

    public Salon(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "Salon";
    }

    @Override
    boolean isEquipementCorrect(Equipement equ) {
        return equ.getType().equals(TypeEquipement.SALON);
    }
}
