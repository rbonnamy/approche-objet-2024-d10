package references;

import instances.Passager;

public class TestReference {
    public static void main(String[] args) {

        // Passage par référence
        Passager p1 = new Passager("LEE", "Paul", "1A");    // p1 est une référence vers un objet situé
                                                            // à l'adresse 1254645
        Passager p2 = new Passager("LEE", "Pauline", "1B"); // p2 est une référence vers un objet situé
                                                            // à l'adresse 8445666
        Passager p3 = p1;                                   // p3 est une référence vers le même objet que p1

        p3.setNom("LEES");

        System.out.println(p3); // LEES Paul 1A
        System.out.println(p1); // LEES Paul 1A

        // Passage par valeur
        int a = 5;
        int b = a; // java copie la valeur et non l'adresse mémoire

        a = 6;
        System.out.println(a);
        System.out.println(b);

    }
}
