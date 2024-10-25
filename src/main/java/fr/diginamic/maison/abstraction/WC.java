package fr.diginamic.maison.abstraction;

public class WC extends Piece {

    public WC(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "WC";
    }

    @Override
    boolean isEquipementCorrect(Equipement equ) {
        return equ.getType().equals(TypeEquipement.WC);
    }
}
