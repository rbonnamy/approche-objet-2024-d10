package scanner_avec_fichier;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestScannerFichier {
    public static void main(String[] args) {
        try {
            // API java.io
            FileInputStream fis = new FileInputStream(new File("C:/Temp/saisieClavier.txt"));

            Scanner scanner = new Scanner(fis); // l'instantiation d'un Scanner prend en param un InputStream
            String ligne1 = scanner.nextLine();
            String ligne2 = scanner.nextLine();

            System.out.println(ligne1);
            System.out.println(ligne2);

            scanner.close();
            fis.close();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
