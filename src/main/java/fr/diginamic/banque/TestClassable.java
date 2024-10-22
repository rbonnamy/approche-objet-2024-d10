package fr.diginamic.banque;

public class TestClassable {
    public static void main(String[] args) {

        traitement(new CompteTaux("01/10/2024", 150.25, 0.75));

        Classable[] classables = new Classable[2];
        classables[0] = new CompteTaux("01/10/2024", 150.25, 0.75);
        classables[1] = new Debit("15/10/2024", 100.0);
    }

    public static void traitement(Classable cl){

    }

}
