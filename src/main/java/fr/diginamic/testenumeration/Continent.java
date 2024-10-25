package fr.diginamic.testenumeration;

public enum Continent {

    AFRIQUE("Afrique"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    OCEANIE("Océanie"),
    NON_DEFINI("Indéfini");

    private String libelle;

    private Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
