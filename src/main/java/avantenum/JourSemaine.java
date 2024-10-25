package avantenum;

public enum JourSemaine {

    LUNDI("Lundi", 0),
    MARDI("Mardi", 1),
    MERCREDI("Mercredi", 2);

    private String nom;
    private int numero;

    private JourSemaine(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }
}
