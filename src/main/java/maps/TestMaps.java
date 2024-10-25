package maps;

import listes.Ville;

import java.util.*;

public class TestMaps {
    public static void main(String[] args) {

        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));

        Set<String> cles = mapVilles.keySet();
        for (String cle: cles){
            Ville v = mapVilles.get(cle);
            System.out.println(cle+" => "+v);
        }

        Collection<Ville> collVilles = mapVilles.values();
        for (Ville v: collVilles){
            System.out.println(v);
        }

        Iterator<Ville> iterVilles = collVilles.iterator();
        while (iterVilles.hasNext()){
            Ville v = iterVilles.next();
            if (v.getNbHabs() > 100000){
                iterVilles.remove();
            }
        }

        System.out.println(mapVilles);
    }
}
