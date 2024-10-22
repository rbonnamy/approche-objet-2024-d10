package essais;

import instances.Avion;
import instances.AvionFactory;
import instances.Passager;

public class TestAvionFactory {
    public static void main(String[] args) {
        Passager p1 = new Passager("LEE", "Paul", "1A");
        Passager p2 = new Passager("LEE", "Pauline", "1B");
        Passager p3 = new Passager("LEE", "Bobby", "1C");

        Avion av1 = AvionFactory.getInstance("AF125634", "Airbus", "A320");
        av1.ajoutPassagers(p1, p2);

        Avion av2 = AvionFactory.getInstance("AF125635", "Airbus", "A340");
        av2.ajoutPassagers(p3);

        AvionFactory.transfert(av1, av2);

        System.out.println(av1);
        System.out.println(av2);
    }
}
