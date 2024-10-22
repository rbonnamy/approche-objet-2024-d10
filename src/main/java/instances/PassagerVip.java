package instances;

public class PassagerVip extends Passager {

    private String typeClasse;

    public PassagerVip(String nom, String prenom, String numSiege, String typeClasse) {
        // il suffit que le constructeur de la classe fille appelle
        // 1 des 2 constructeurs de la classe mère
        super(nom, prenom, numSiege);
        this.typeClasse = typeClasse;
    }
}
