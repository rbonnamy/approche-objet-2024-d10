package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEcritureFichiers {
    public static void main(String[] args) {
        Path pathOrigine = Paths.get("C:/Temp/recensement.csv");
        Path pathDestination = Paths.get("C:/Temp/recensement-23102024.csv");
        try {
            List<Commune> listeCommunes = new ArrayList<>();

            List<String> listeLignes = Files.readAllLines(pathOrigine);

            String ligneEntete = listeLignes.removeFirst();

            for (String ligne : listeLignes) {
                System.out.println(ligne);

                // découper la ligne selon le caractère ;
                String[] elements = ligne.split(";");
                String nomRegion = elements[1];
                String codeDept = elements[2];
                String nomCommune = elements[6];
                int population = Integer.parseInt(elements[9].replaceAll(" ", ""));

                Commune commune  = new Commune(nomCommune, codeDept, nomRegion, population);
                listeCommunes.add(commune);
            }

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
