package fr.diginamic.maison.generiques;

public class WC extends Piece<EquipementWC> {

    public WC(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "WC";
    }
}
