package instances;

public class Passager {
    String nom;
    String prenom;
    String numSiege;

    public static int compteur;

    public Passager(String nom, String prenom, String numSiege) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSiege = numSiege;
    }

    public String toString(){
        return nom+" "+prenom+" "+numSiege;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumSiege() {
        return numSiege;
    }

    public void setNumSiege(String numSiege) {
        this.numSiege = numSiege;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
