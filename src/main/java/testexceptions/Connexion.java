package testexceptions;

public class Connexion {

    public static void connect(String url, String user, String pwd){

        if (url==null){
            // Le rôle d'une RuntimeException est de provoquer l'arrêt de l'application
            throw new ExceptionTechnique("Impossible de se connecter à la base de données");
        }
    }
}
