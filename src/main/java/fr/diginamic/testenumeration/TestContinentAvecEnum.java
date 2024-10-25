package fr.diginamic.testenumeration;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> listeVilles = new ArrayList<>();
        Ville foix = new Ville("Foix", 9700);
        Collections.addAll(listeVilles, new Ville("Nice", 343000, Continent.EUROPE), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400, Continent.ASIE), new Ville("Lyon", 484000), foix, new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));

        for (Ville v: listeVilles){
            System.out.println(v);
        }



    }
}
