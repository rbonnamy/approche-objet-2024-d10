package demomock.cas1;

import java.util.List;

public class AlgorithmeVolumeNormal extends Algorithme{
    /**
     * Constructeur
     *
     * @param operations
     */
    public AlgorithmeVolumeNormal(List<Operation> operations) {
        super(operations);
    }

    @Override
    public double calculer() {
        return operations.stream().mapToDouble(o->o.getMontant()).sum()*0.80;
    }
}
