package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> listeVilles = new ArrayList<>();
        Ville foix = new Ville("Foix", 9700);
        Collections.addAll(listeVilles, new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400), new Ville("Lyon", 484000), foix, new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));
        Collections.sort(listeVilles, new VilleComparator(VilleComparator.TRI_POPULATION)); // 0 est un nb magique : que représente t'il ?

        Ville villeRechechee = new Ville("Foix", 9700);

        /*
        Recherchez et affichez la ville la plus peuplée
        • Supprimez la ville la moins peuplée
        • Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        • Affichez enfin la liste résultante
         */
        Ville villeMin = listeVilles.get(0);
        Ville villeMax = listeVilles.get(0);
        for (int i = 1; i < listeVilles.size(); i++) {
            Ville villeCourante = listeVilles.get(i);
            if (villeCourante.getNbHabs() < villeMin.getNbHabs()) {
                villeMin = villeCourante;
            }
            if (villeCourante.getNbHabs() > villeMax.getNbHabs()) {
                villeMax = villeCourante;
            }
        }
        System.out.println("Ville la moins peuplée=" + villeMin);
        System.out.println("Ville la plus peuplée=" + villeMax);
        System.out.println("----------------------------");

        // Supprimez la ville la moins peuplée
        listeVilles.remove(villeRechechee); // nécessite que equals existe dans classe Ville sinon remove peut ne pas bien
        // fonctionner. Pareil pour contains et indexOf.

        // Affichage avec une expression lambda
        listeVilles.forEach(v -> System.out.println(v));
        System.out.println("----------------------------");

        // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville ville : listeVilles) { // à chaque itération ville référence une ville de la liste
            if (ville.getNbHabs() >= 100_000) {
                ville.setNom(ville.getNom().toUpperCase()); // les paramètres sont évalués avant l'appel de la méthode
            }
        }

        // Affichage avec une expression lambda
        listeVilles.forEach(v -> System.out.println(v));

    }
}
