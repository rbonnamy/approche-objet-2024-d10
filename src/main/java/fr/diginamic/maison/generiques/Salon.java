package fr.diginamic.maison.generiques;

public class Salon extends Piece<EquipementSalon> {

    public Salon(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "Salon";
    }
}
