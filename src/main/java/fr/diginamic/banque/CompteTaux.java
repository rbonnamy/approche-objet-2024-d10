package fr.diginamic.banque;

public class CompteTaux extends Compte implements Classable {

    private double taux;

    public CompteTaux(String numero, double solde, double taux) {
        super(numero, solde); // appel du construct classe mère
        this.taux = taux;
    }

    @Override
    public void doTask(String param) {
        System.out.println("Coucou");
    }

    @Override
    public String toString(){
        String infosClasseMere = super.toString();
        return infosClasseMere+" "+taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

}
