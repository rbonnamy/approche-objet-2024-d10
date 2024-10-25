package fr.diginamic.maison.abstraction;

public class EquipementSalon extends Equipement {
    public EquipementSalon(String nom) {
        super(nom);
    }

    @Override
    public TypeEquipement getType() {
        return TypeEquipement.SALON;
    }
}