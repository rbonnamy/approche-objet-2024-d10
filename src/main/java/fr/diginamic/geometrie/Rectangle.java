package fr.diginamic.geometrie;

public class Rectangle implements ObjetGeometrique {

    private double longueur;
    private double largeur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public String toString(){
        return "Surface :"+surface()+" Périmètre: "+perimetre();
    }

    @Override
    public double perimetre() {
        return 2.0*(largeur+longueur);
    }

    @Override
    public double surface() {
        return largeur*longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }
}
