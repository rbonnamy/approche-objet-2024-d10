package fr.diginamic.maison.abstraction;

public class EquipementChambre extends Equipement {

    public EquipementChambre(String nom) {

        super(nom);
    }

    @Override
    public TypeEquipement getType() {
        return TypeEquipement.CHAMBRE;
    }
}