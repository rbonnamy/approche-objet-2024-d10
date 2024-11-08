package utils;

import annotations.ToString;

import java.lang.reflect.Field;

/**
 * Classe qui fournit des services de traitement de chaines de caractères et/ou de transformation en chaine de caractères
 * @author R. BONNAMY
 */
public final class StringUtils {

    /**
     * Convertit une instance d'objet en chaine de caractères. La transformation est basée sur <br>
     * une annotation appelée <strong>@ToString</strong> et qui a 2 propriétés:
     * <ul>
     *     <li>separateur qui vaut " " par défaut</li>
     *     <li>upperCase qui vaut true ou false</li>
     * </ul>
     * @param obj instance à transformer en chaine de caractères
     * @return String
     */
    public static String toString(Object obj){
        StringBuilder builder = new StringBuilder();
        Field[] tableauAttributsInstance = obj.getClass().getDeclaredFields();

        for (Field attributInstance: tableauAttributsInstance){

            if (attributInstance.isAnnotationPresent(ToString.class)){
                attributInstance.setAccessible(true);
                try {
                    ToString annotationAttribut = attributInstance.getAnnotation(ToString.class);
                    Object valeurAttributInstance = attributInstance.get(obj);
                    if (valeurAttributInstance!=null && annotationAttribut.upperCase()) {
                        builder.append(valeurAttributInstance.toString().toUpperCase());
                    }
                    else {
                        builder.append(annotationAttribut.separateur());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return builder.toString();
    }

}
