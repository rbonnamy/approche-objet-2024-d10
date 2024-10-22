package fr.diginamic.geometrie;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere implements Objet3d{

    private double rayon;

    public Sphere(double rayon){
        this.rayon = rayon;
    }

    @Override
    public String toString(){
        return "Surface :"+surface()+" Périmètre: "+perimetre()+" volume: "+volume();
    }

    @Override
    public double volume() {
        return 4.0/3.0*PI*pow(rayon, 3.0);
    }

    @Override
    public double perimetre() {
        return 2.0*PI*rayon;
    }

    @Override
    public double surface() {
        return 4.0*PI*pow(rayon, 2.0);
    }
}
