package annotations;

import java.lang.reflect.Field;
import java.util.*;

public class CsvUtils {
    // La méthode static possède un type générique : à mettre après static
    public static <T> String toCsv(T t){
        StringBuilder builder = new StringBuilder();

        // On récupère la classe de ville (qui est Ville)
        Class<?> cl = t.getClass();

        // On récupère la liste des attributs d'instance de la classe
        Field[] fields = cl.getDeclaredFields();
        List<Field> annotatedFields = new ArrayList<>();
        for (Field f: fields){
            if (f.isAnnotationPresent(ToCsv.class)){
                annotatedFields.add(f);
            }
        }
        Collections.sort(annotatedFields, (f1, f2)->f1.getAnnotation(ToCsv.class).ordre()-f2.getAnnotation(ToCsv.class).ordre());
        for (Field f: annotatedFields){
            // Pour chaque attribut, on regarde si @ToCsv est présent dessus
            if (f.isAnnotationPresent(ToCsv.class)){

                // On force l'accès en lecture même s'il est privé
                f.setAccessible(true);
                try {

                    // On récupère la valeur de l'attribut f pour t
                    Object value = f.get(t);
                    ToCsv annotation = f.getAnnotation(ToCsv.class);
                    if (annotation.upperCase() && value!=null){
                        builder.append(value.toString().toUpperCase()).append(";");
                    }
                    else {
                        builder.append(value).append(";");
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return builder.toString();
    }
}
