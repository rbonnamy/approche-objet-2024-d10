package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        for (Saison saison : Saison.values()){
            System.out.println(saison);
        }

        System.out.println("-------------------------");
        String chaine = "ETE";
        Saison saisonEte = Saison.valueOf(chaine);
        System.out.println(saisonEte);

        System.out.println("-------------------------");
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getByLabel(libelle);
        System.out.println(saisonHiver);
    }
}
