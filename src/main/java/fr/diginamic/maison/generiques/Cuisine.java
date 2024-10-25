package fr.diginamic.maison.generiques;

public class Cuisine extends Piece<EquipementCuisine> {

    public Cuisine(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "Cuisine";
    }
}
