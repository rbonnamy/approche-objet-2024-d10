package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {
    public static void main(String[] args) {

        List<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65, "Europe"));
        listePays.add(new Pays("Russie", 150, "Asie"));
        listePays.add(new Pays("Belgique", 10, "Europe"));
        listePays.add(new Pays("NZ", 4, "Océanie"));
        listePays.add(new Pays("Chine", 1400, "Asie"));
        listePays.add(new Pays("Indonésie", 220, "Asie"));
        listePays.add(new Pays("Allemagne", 84, "Europe"));
        listePays.add(new Pays("Australie", 20, "Océanie"));

        // Je vais avoir un compteur par continent : Idée, utiliser les HashMap
        // pour stocker un compteur de type Integer par continent String

        HashMap<String, Integer> mapCompteurs = new HashMap<>();
        for (Pays p: listePays){
            mapCompteurs.put(p.getContinent(), mapCompteurs.getOrDefault(p.getContinent(), 0) + 1);
        }
        System.out.println(mapCompteurs);
    }
}
