package fr.diginamic.maison.abstraction;

public class SalleDeBain extends Piece {

    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    boolean isEquipementCorrect(Equipement equ) {
        return equ.getType().equals(TypeEquipement.SALLE_DE_BAIN);
    }

    @Override
    public String getType() {
        return "SalleDeBain";
    }
}
