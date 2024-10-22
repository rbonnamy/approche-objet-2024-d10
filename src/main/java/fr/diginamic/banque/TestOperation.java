package fr.diginamic.banque;

public class TestOperation {
    public static void main(String[] args) {

        Credit c1 = new Credit("15/10/2024", 2000.0);
        Debit d1 = new Debit("17/10/2024", 852.25);
        Credit c2 = new Credit("20/10/2024", 150.5);
        Debit d2 = new Debit("20/10/2024", 15.3);

        Operation[] opes = {c1, d1, c2, d2};

        for (int i = 0; i < opes.length; i++) {
            System.out.println(opes[i]);

            // Boucle :
            // index 0: il traite une instance de Credit donc il appelle getType() de c1
        }
    }
}
