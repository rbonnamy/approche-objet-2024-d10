package listes;

import annotations.ToString;
import fr.diginamic.testenumeration.Continent;
import utils.StringUtils;

import java.util.Objects;

/**
 * Ville représente un concept métier.
 * On n'a pas le droit en POO de polluer des concepts métier avec des attributs techniques
 */
public class Ville implements Comparable<Ville> {

    @ToString(upperCase = true, separateur = " ; ")
    private String nom;
    @ToString
    private int nbHabs;
    private Continent continent;

    public Ville(String nom, int nbHabs) {
        this.nom = nom;
        this.nbHabs = nbHabs;
        this.continent = Continent.NON_DEFINI;
    }

    public Ville(String nom, int nbHabs, Continent continent) {
        this.nom = nom;
        this.nbHabs = nbHabs;
        this.continent = continent;
    }

    @Override
    public int compareTo(Ville autre) {
        if (this.getNbHabs() > autre.getNbHabs()){
            return 1;
        }
        else if (this.getNbHabs() < autre.getNbHabs()){
            return -1;
        }
        return this.nom.toLowerCase().compareTo(autre.getNom().toLowerCase());
    }

    @Override
    public String toString() {
        return StringUtils.toString(this);
    }

    /**
     * Le paradigme à respecter:
     * => si 2 objets sont égaux alors leur hashcode doivent être égaux.
     */

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) {
            return false;
        }
        // que se passe t'il si nom est null ? => NullPointerException
        return nbHabs == ville.nbHabs && Objects.equals(this.nom, ville.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabs);
    }

    public int getNbHabs() {
        return nbHabs;
    }

    public void setNbHabs(int nbHabs) {
        this.nbHabs = nbHabs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
