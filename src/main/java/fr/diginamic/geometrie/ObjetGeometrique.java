package fr.diginamic.geometrie;

/**
 * Objet géométrique
 */
public interface ObjetGeometrique {

    /** Retourne le périmètre d’une forme géométrique
     * @return double
     */
    double perimetre();

    /** Retourne la surface
     * @return double
     */
    double surface();

}
