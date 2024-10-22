package strings;

public class TestImmu {
    public static void main(String[] args) {
        String s = "  Coucou  ";
        s = s.trim(); // trim ne modifie pas s. trim renvoie une nouvelle chaine calculée à partir de s
        s = s.concat(" les amis");
        System.out.println(s);

        Integer a = 15; // immutable

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String ch = "Bonjour nous sommes "+a+" à être invités à la fête.";
        }
        long end =  System.currentTimeMillis();
        System.out.println("Durée en ms:"+(end-start));

    }
}
