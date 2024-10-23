package fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) {

        // Attention ce fonctionnement d'IntelliJ ne fonctionne pas en dehors d'IntelliJ
        // car pour les projets MAVEN le répertoire de travail par défaut est le répertoire de compilation
        // et non le répertoire du projet.
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);

        Path path = Paths.get("src/main/java/recensement.csv");
        try {
            List<String> lignes = Files.readAllLines(path);
            lignes.forEach(l-> System.out.println(l));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
