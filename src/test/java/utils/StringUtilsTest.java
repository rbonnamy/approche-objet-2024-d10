package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void testToString() {
        String resultat = StringUtils.toString(new Entite("Montpellier", "34", "Occitanie", 280000));
        // Normalement la méthode doit retournée MONTPELLIER : Occitanie => 280000.
        // Vérifions:
        assertEquals("MONTPELLIER : Occitanie => 280000", resultat);
    }

    @Test
    public void testToStringAvecNull() {
        String resultat = StringUtils.toString(new Entite("Montpellier", "34", null, 280000));
        // Normalement la méthode doit retournée MONTPELLIER : Occitanie => 280000.
        // Vérifions:
        assertEquals("MONTPELLIER : null => 280000", resultat);
    }
}