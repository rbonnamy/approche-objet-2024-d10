package utils;

import annotations.ToString;

import java.util.Objects;

public class Entite implements Comparable<Entite> {

    @ToString(separateur = " : ", upperCase = true)
    private String nom;

    private String codeDept;

    @ToString(separateur = " => ")
    private String nomRegion;

    @ToString
    private int population;

    public Entite(String nom, String codeDept, String nomRegion, int population) {
        this.nom = nom;
        this.codeDept = codeDept;
        this.nomRegion = nomRegion;
        this.population = population;
    }

    @Override
    public int compareTo(Entite autre) {
        if (this.getPopulation() > autre.getPopulation()){
            return 1;
        }
        else if (this.getPopulation() < autre.getPopulation()){
            return -1;
        }
        return this.nom.toLowerCase().compareTo(autre.getNom().toLowerCase());
    }

    @Override
    public String toString() {
        return StringUtils.toString(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Entite commune)) {
            return false;
        }
        return population == commune.population && Objects.equals(nom, commune.nom) && Objects.equals(codeDept, commune.codeDept) && Objects.equals(nomRegion, commune.nomRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDept, nomRegion, population);
    }

    public String getCodeDept() {
        return codeDept;
    }

    public void setCodeDept(String codeDept) {
        this.codeDept = codeDept;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
