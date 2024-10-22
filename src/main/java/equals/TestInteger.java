package equals;

public class TestInteger {
    public static void main(String[] args) {
        Integer a = 128; // Integer pool pour tous les nombres entre 0 et 127
        Integer b = 128;

        if (a == b){
            System.out.println("EGAL");
        }
        else {
            System.out.println("DIFF");
        }

        // Moralité, ne pas utiliser le == pour les wrappers
        if (a.equals(b)){
            System.out.println("EGAL");
        }
        else {
            System.out.println("DIFF");
        }
    }
}
