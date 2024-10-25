package testexceptions;

import listes.Ville;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Veuillez saisir un code dept:");
            String codeDept = scanner.nextLine();
            try {
                List<Ville> listeVilles = RechercheService.rechercheVilles(codeDept); // exception si code departement est nul
                for (Ville v : listeVilles) {
                    System.out.println(v);
                }

            } catch (ExceptionFonctionnelle e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
