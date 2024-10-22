package essais;

import instances.Avion;
import instances.Passager;

public class TestAvion {
    public static void main(String[] args) {

        Passager p1 = new Passager("LEE", "Paul", "1A");
        Passager p2 = new Passager("LEE", "Pauline", "1B");
        Passager p3 = new Passager("LEE", "Bobby", "1C");

        Passager.compteur = 2; // signifie que le compteur vaut 2 pour toutes les instances

        System.out.println(Passager.compteur);

        Avion av = new Avion("AF125634", "Airbus", "A320");
        av.ajoutPassagers(p1);
        av.ajoutPassagers(p2, p3);

        System.out.println(av.getPassagers().length);
        for (int i=0; i<av.getPassagers().length; i++){
            System.out.println(av.getPassagers()[i]);
        }
    }
}
