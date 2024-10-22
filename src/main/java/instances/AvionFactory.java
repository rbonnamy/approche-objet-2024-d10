package instances;

public class AvionFactory {

    public static Avion getInstance(String immatriculation, String marque, String modele){
        return new Avion(immatriculation, marque, modele);
    }

    /**
     * Elle prend 2 avions en paramètres et retourne 1 avion avec les règles suivantes :<br>
     * <ul>
     *     <li>C’est l’avion qui a le plus de passagers qui est retourné</li>
     *     <li>Les passagers de l’avion qui a le moins de passagers sont transférés dans l’avion qui en a le plus. </li>
     * </ul>
     * @param av1 avion 1
     * @param av2 avion 2
     * @return Avion
     */
    public static void transfert(Avion av1, Avion av2) {
        if (av1.getPassagers().length> av2.getPassagers().length){
            av1.ajoutPassagers(av2.getPassagers());
            av2.setPassagers(new Passager[0]);
        }
        else {
            av2.ajoutPassagers(av1.getPassagers());
            av1.setPassagers(new Passager[0]);
        }
    }
}
