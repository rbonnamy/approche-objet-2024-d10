package varargs;

public class TestVarargs {

    public static void main(String[] args) {

        // Appel :
        int resultat = additionner();
        System.out.println(resultat);

        resultat = additionner(1);
        System.out.println(resultat);

        resultat = additionner(1, 15, -56, 8, 9, 16, 26);
        System.out.println(resultat);

        int[] array = {8, 7, 0, 4};
        resultat = additionner(array);
        System.out.println(resultat);
    }

    public static int additionner(int... valeurs) {

        int somme = 0;
        for (int i = 0; i < valeurs.length; i++) {
            somme+= valeurs[i];
        }
        return somme;
    }
}
