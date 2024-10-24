package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestEcritureFichiers {
    public static void main(String[] args) {

        // La classe Paths fonctionne avec la notion de propriété système user.dir qu'on peut positionner
        // Pour positionner cette propriété il faut lancer l'application avec le paramètre suivant :
        // -Duser.dir="C:\Temp\" par exemple.
        // Le problème est qu'IntelliJ force ce répertoire avec le chemin du projet.
        System.out.println(System.getProperty("user.dir"));

        Path pathOrigine = Paths.get("recensement.csv");
        Path pathDestination = Paths.get("C:/Temp/recensement-24102024.csv");
        try {
            List<Commune> listeCommunes = new ArrayList<>();

            List<String> listeLignes = Files.readAllLines(pathOrigine);

            String ligneEntete = listeLignes.removeFirst();

            for (String ligne : listeLignes) {
                // découper la ligne selon le caractère ;
                String[] elements = ligne.split(";");
                String nomRegion = elements[1];
                String codeDept = elements[2];
                String nomCommune = elements[6];
                int population = Integer.parseInt(elements[9].replaceAll(" ", ""));

                Commune commune  = new Commune(nomCommune, codeDept, nomRegion, population);
                listeCommunes.add(commune);
            }
            Collections.sort(listeCommunes);

            // Préparer mon fichier de sortie

            System.out.print("Veuillez sélectionner un nombre d'habitants min:");
            Scanner scan = new Scanner(System.in);
            int nbHabs = scan.nextInt();

            ArrayList<String> lignesDestination = new ArrayList<>();
            lignesDestination.add("Nom de la région;code département;Nom de la commune;Population totale");
            for (Commune commune : listeCommunes){
                if (commune.getPopulation()>nbHabs){
                    String communeStr = commune.getNomRegion()+";"+commune.getCodeDept()+";"+commune.getNom()+";"+commune.getPopulation();
                    lignesDestination.add(communeStr);
                }
            }
            Files.write(pathDestination, lignesDestination);
            scan.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
