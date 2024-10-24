package listes;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class VilleComparator implements Comparator<Ville> {

    private int type;

    public static final int TRI_POPULATION = 0;
    public static final int TRI_ALPHABETIQUE = 1;

    public VilleComparator(int type) {
        this.type=type;
    }

    @Override
    public int compare(Ville v1, Ville v2) {
        if (type==0) {
            if (v1.getNbHabs() > v2.getNbHabs()) {
                return 1;
            } else if (v1.getNbHabs() < v2.getNbHabs()) {
                return -1;
            }
        }
        else if (type==1){
            Collator collatorFr = Collator.getInstance(Locale.FRANCE);
            return collatorFr.compare(v1.getNom().toLowerCase(), v2.getNom().toLowerCase());
        }
        return 0;
    }
}
