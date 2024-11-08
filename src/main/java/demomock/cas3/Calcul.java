package demomock.cas3;

public class Calcul {

    private int compteurPos;
    private int compteurNeg;

    public void traitement(int valeur){
        if (valeur>0){
            incrementePos();
        }
        else {
            incrementeNeg();
        }
    }

    void incrementePos() {
        compteurPos++;
    }

    void incrementeNeg() {
        compteurNeg++;
    }
}
