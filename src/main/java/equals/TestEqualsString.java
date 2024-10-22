package equals;

public class TestEqualsString {
    public static void main(String[] args) {

        String a = "Coucou"; // initialisation avec l'opérateur guillemet ou double quote
                             // Dans ce cas la chaine "Coucou" est déposée dans le String pool (un espace memoire dédié)
        String b = "Coucou"; // comme Coucou existe déjà dans le String pool, b référence la même zone mémoire que a.

        String c = new String("Coucou"); // j'ai utilisé l'opérateur new et donc je n'utilise pas le String pool

        // == compare les adresses mémoires
        if (a == b){
            System.out.println("Egales");
        }
        else {
            System.out.println("Diff");
        }

        // MORALITé : ne jamais utilisé le == pour les String et même pour tous les objets.
        if (a.equals(c)){
            System.out.println("Egales");
        }
        else {
            System.out.println("Diff");
        }

    }
}
