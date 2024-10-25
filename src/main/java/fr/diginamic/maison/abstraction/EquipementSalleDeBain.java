package fr.diginamic.maison.abstraction;

public class EquipementSalleDeBain extends Equipement {
    public EquipementSalleDeBain(String nom) {
        super(nom);
    }

    @Override
    public TypeEquipement getType() {
        return TypeEquipement.SALLE_DE_BAIN;
    }
}