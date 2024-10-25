package fr.diginamic.maison.generiques;

public class Chambre extends Piece<EquipementChambre> {

    public Chambre(double superficie, int etage) {

        super(superficie, etage);
    }

    @Override
    public String getType() {

        return "Chambre";
    }
}
