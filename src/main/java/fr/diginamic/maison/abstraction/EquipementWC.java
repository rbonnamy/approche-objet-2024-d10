package fr.diginamic.maison.abstraction;

public class EquipementWC extends Equipement {

    public EquipementWC(String nom) {

        super(nom);
    }

    @Override
    public TypeEquipement getType() {
        return TypeEquipement.WC;
    }
}