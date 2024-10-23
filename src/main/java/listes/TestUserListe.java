package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestUserListe {
    public static void main(String[] args) {
        User u1 = new User("dupont", "jean");
        User u2 = new User("durand", "jean");
        User u3 = new User("martin", "jean");
        User u4 = new User("martin", "jean");

        ArrayList<User> listeUsers = new ArrayList<>();
        listeUsers.add(u1);
        listeUsers.add(u2);
        listeUsers.add(u3);
        listeUsers.add(u4);
        listeUsers.add(u3);

        listeUsers.remove(new User("martin", "jean")); // equals nécessaire
        boolean existe = listeUsers.contains(new User("martin", "jean")); // equals nécessaire
        System.out.println(existe);

        int index = listeUsers.indexOf(new User("martin", "jean")); // equals nécessaire
        System.out.println(index);

        // On reverra ça plus tard :
        listeUsers.forEach(u -> System.out.println(u));

        // Problème d'accès concurrent !! On ne supprime pas des éléments dans une liste pendant qu'on la
        // parcourt avec une boucle for
        Iterator<User> iterator = listeUsers.iterator();
        while (iterator.hasNext()){
            User u = iterator.next();
            if (u.getNom().equals("martin")){
                iterator.remove(); // je passe par l'iterator pour faire le remove
            }
        }

        // Réinitialisation d'un iterator
        iterator = listeUsers.iterator();

    }
}
