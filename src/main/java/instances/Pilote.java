package instances;

import java.time.LocalDate;

public class Pilote {
    String nom;
    String prenom;
    String dateLicence;

    public Pilote(String nom, String prenom, String dateLicence) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateLicence = dateLicence;
    }

    public final void faireDecoller(){

    }

    public String getDateLicence() {
        return dateLicence;
    }

    public void setDateLicence(String dateLicence) {
        this.dateLicence = dateLicence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
