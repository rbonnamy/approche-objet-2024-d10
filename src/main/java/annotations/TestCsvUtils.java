package annotations;

import fichiers.java.nio.Commune;

public class TestCsvUtils {
    public static void main(String[] args) {

        // VOIR LE TP sur la génération de fichiers qui utilise CsvUtils

        Commune co = new Commune("Montpellier", "34", "Occitanie", 280000);
        String serialisationCsv = CsvUtils.toCsv(co);
        System.out.println(serialisationCsv);

    }

}
