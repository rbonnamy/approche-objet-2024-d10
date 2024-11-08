package demomock.cas1;

import java.time.LocalDate;

public class Operation {
    private LocalDate date;
    private double montant;

    public Operation(LocalDate date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    /**
     * Getter
     *
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter
     *
     * @param date date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Getter
     *
     * @return montant
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Setter
     *
     * @param montant montant
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }
}
