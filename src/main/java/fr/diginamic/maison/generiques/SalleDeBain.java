package fr.diginamic.maison.generiques;

public class SalleDeBain extends Piece<EquipementSalleDeBain> {

    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "SalleDeBain";
    }
}
