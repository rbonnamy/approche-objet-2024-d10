package fr.diginamic.banque;

public class Compte {

    // Attributs, ou variables, d'instance
    private String numero;
    private double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Compte autre)){
            return false;
        }
        // J'ai besoin d'une référence de type Compte
        // Compte autre = (Compte) obj; // Opération de casting
        return numero.equals(autre.getNumero());
    }

    @Override
    public String toString(){
        return numero+" "+solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
