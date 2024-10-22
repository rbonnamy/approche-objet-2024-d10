package fr.diginamic.geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] objets = new ObjetGeometrique[4];
        objets[0]=new Cercle(1.25);
        objets[1]=new Rectangle(2.5, 1.2);
        objets[2]=new Carre(1.2);
        objets[3]=new Sphere(2.6);

        for (int i = 0; i < objets.length; i++) {
            System.out.println(objets[i]);
        }

        // Je ne peux mettre que des sphères
        Objet3d[] objets3d = new Objet3d[1];
        objets3d[0] = new Sphere(2.4);

    }
}
