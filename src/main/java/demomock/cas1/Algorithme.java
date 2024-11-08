package demomock.cas1;

import java.util.List;

public abstract class Algorithme {

    protected List<Operation> operations;

    /**
     * Constructeur
     * @param operations
     */
    public Algorithme(List<Operation> operations) {
        this.operations = operations;
    }

    public abstract double calculer();

    /**
     * Getter
     *
     * @return operations
     */
    public List<Operation> getOperations() {
        return operations;
    }

    /**
     * Setter
     *
     * @param operations operations
     */
    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
