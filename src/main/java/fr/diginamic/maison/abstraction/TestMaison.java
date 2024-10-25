package fr.diginamic.maison.abstraction;

import fr.diginamic.maison.exceptions.MaisonException;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        Chambre ch = new Chambre(12, 0);
        try {
            ch.addEquipements(new EquipementChambre("Lit"), new EquipementCuisine("Evier"));
        } catch (MaisonException e) {
            System.err.println(e.getMessage());
        }

        maison.ajouterPiece(new Chambre(12, 0));
        maison.ajouterPiece(new Cuisine(10, 0));
        maison.ajouterPiece(new Salon(25, 0));
        maison.ajouterPiece(new SalleDeBain(8, 1));
        maison.ajouterPiece(new WC(2, 1));
        maison.ajouterPiece(new Chambre(15, 1));
        maison.ajouterPiece(new Chambre(20, 2));

        // Test null et données non cohérentes
//        maison.ajouterPiece(null); // Ne doit pas être ajouté
//        maison.ajouterPiece(new Chambre(-5, 1)); // Ne doit pas être ajouté

        // Superficie totale
        System.out.println("Superficie totale : " + maison.superficieTotale());

        // Superficie par étage
        System.out.println("Superficie au RDC : " + maison.superficieEtage(0));
        System.out.println("Superficie au 1er étage : " + maison.superficieEtage(1));

        // Superficie par type de pièce
        System.out.println("Superficie des chambres : " + maison.superficieType("Chambre"));

        // Nombre de pièces par type
        System.out.println("Nombre de chambres : " + maison.nombrePiecesType("Chambre"));
    }
}
