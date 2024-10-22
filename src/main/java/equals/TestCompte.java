package equals;

import fr.diginamic.banque.Compte;

public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("FR123", 100.0);
        Compte c2 = new Compte("FR123", 100.0);
        Compte c3 = c2;

        if (c3.equals(c2)){
            System.out.println("EGAL");
        }
        else {
            System.out.println("DIFF");
        }
    }
}
