package annotations;

import fichiers.java.nio.Commune;

public class TestToString {
    public static void main(String[] args) {
        Commune co = new Commune("Montpellier", "34", "Occitanie", 280000);
        System.out.println(co.toString());
    }
}
