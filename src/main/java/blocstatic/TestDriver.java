package blocstatic;

public class TestDriver {
    public static void main(String[] args) {
        try {
            Class.forName("blocstatic.Driver"); // technique pour exécuter un bloc static dans une classe
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
