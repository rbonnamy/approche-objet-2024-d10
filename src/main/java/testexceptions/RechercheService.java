package testexceptions;

import listes.Ville;

import java.util.ArrayList;
import java.util.List;

public class RechercheService {

    public static List<Ville> rechercheVilles(String codeDept) throws ExceptionFonctionnelle {
        Connexion.connect("", "root", "");

        if (codeDept==null || codeDept.equals("")){
            throw new ExceptionFonctionnelle("Le code du département ne doit pas être nul");
        }
        return new ArrayList<>();
    }
}
