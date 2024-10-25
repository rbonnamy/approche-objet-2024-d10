package fr.diginamic.maison.abstraction;

public class EquipementCuisine extends Equipement {
    public EquipementCuisine(String nom) {
        super(nom);
    }

    @Override
    public TypeEquipement getType() {
        return TypeEquipement.CUISINE;
    }
}