package demofinal;

import instances.Passager;

public class TestFinal {
    public static void main(String[] args) {
        final int a = 5;

        final Passager p1 = new Passager("LEE", "Paul", "1A"); // c'est la référence qui est constante
        p1.setNom("LIE");

        //p1 = new Passager("LEE", "Marcelline", "1B"); // je ne peux pas changer de référence

    }
}
