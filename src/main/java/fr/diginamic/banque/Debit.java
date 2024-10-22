package fr.diginamic.banque;

public class Debit extends Operation implements Classable {

    public Debit(String date, double montant) {

        super(date, montant);
    }

    @Override
    public String getType(){
        return "Débit";
    }

    @Override
    public void doTask(String param) {

    }
}
