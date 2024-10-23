package listes;

import java.util.Collections;
import java.util.HashSet;

public class TestSets {
    public static void main(String[] args) {
        // Set est une interface qui possède plusieurs classes d'implémentation (i.e. classes filles)
        // La classe la plus utilisée c'est HashSet
        HashSet<Ville> villes = new HashSet<>();

        // Collections.addAll prend en 1er paramètre une Collection dont hérite HashSet et Arraylist

        // Si hashCode n'existe pas dans la classe Ville alors c'est celle de Object qui est utilisée
        // et qui se base sur les adresses mémoires
        Collections.addAll(villes, new Ville("Foix", 9700), new Ville("Foix", 9700));

        System.out.println(villes.size());
    }
}
