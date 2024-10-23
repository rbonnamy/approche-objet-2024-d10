package fichiers;

import java.io.IOException;
import java.nio.file.*;

public class TestDeplacementRepertoire {
    public static void main(String[] args) {
        Path pathOrigine = Paths.get("C:/Temp/monRepertoire");
        Path pathDestination = Paths.get("C:/Temp/Work/monRepertoire");

        // Attention si le répertoire de destination n'est pas vide: une exception est lancée
        try {
            Files.move(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            //throw new RuntimeException(e);
        }

        Path pathDirectory = Paths.get("C:/Temp/");

        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory);
            stream.forEach(f -> System.out.println(f));
            stream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
