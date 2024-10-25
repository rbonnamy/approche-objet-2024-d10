package avantenum;

public class TestJourSemaine {
    public static void main(String[] args) {
        JourSemaine j = JourSemaine.LUNDI;
        Continent c = Continent.OCEANIE;

        JourSemaine[] tabJours = JourSemaine.values();
        Continent ct = Continent.valueOf("AFRIQUE");
    }
}
