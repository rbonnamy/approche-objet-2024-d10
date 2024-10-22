package fr.diginamic.banque;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] tabComptes = new Compte[2];
        tabComptes[0] = new Compte("FR12345", 100.0);
        tabComptes[1] = new CompteTaux("FR001245", 1500.0, 1.25);

        for (int i = 0; i < tabComptes.length; i++) {
            System.out.println(tabComptes[i]);
        }
    }
}
