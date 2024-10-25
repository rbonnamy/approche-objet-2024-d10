package fr.diginamic.maison.abstraction;

public class Chambre extends Piece {

    public Chambre(double superficie, int etage) {

        super(superficie, etage);
    }

    @Override
    boolean isEquipementCorrect(Equipement equ) {
        return equ.getType().equals(TypeEquipement.CHAMBRE);
    }

    @Override
    public String getType() {

        return "Chambre";
    }
}
