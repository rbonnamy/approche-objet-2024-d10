package instances;

import java.util.Arrays;

public class Avion {
    String immatriculation;
    String marque;
    String modele;
    Pilote pilote;
    Passager[] passagers;

    private int nbPassagers;

    public Avion(String immatriculation, String marque, String modele ) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
        passagers = new Passager[0];
    }

    public Avion(String immatriculation, String marque, String modele, int capaciteMax) {
        this(immatriculation, marque, modele);
        passagers = new Passager[capaciteMax];
    }

    private void ajoutPassager(Passager nvPassager){
        if (nbPassagers+1>passagers.length){
            passagers = Arrays.copyOf(passagers, passagers.length+1);
        }
        nbPassagers++;
        passagers[nbPassagers-1]=nvPassager;
    }

    public void ajoutPassagers(Passager... nvPassagers){

        // nvPassagers est un tableau
        for (int i=0; i<nvPassagers.length; i++){
            ajoutPassager(nvPassagers[i]);
        }
    }

    @Override
    public String toString() {
        return "Avion{" +
                "immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", nbPassagers=" + getPassagers().length +
                '}';
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }
}
