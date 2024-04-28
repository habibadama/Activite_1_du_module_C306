
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculTest {

    @Test
    public void testConstructeur() {
        // Il n'est pas nécessaire de tester le constructeur d'une classe utilitaire
    }

    @Test
    public void testNoteBornee() {
        // Test lorsque la note est supérieure à la valeur maximale
        assertEquals(10.0, Calcul.noteBornee(12.0, 0.0, 10.0), 0.001);
        // Test lorsque la note est inférieure à la valeur minimale
        assertEquals(0.0, Calcul.noteBornee(-5.0, 0.0, 10.0), 0.001);
        // Test lorsque la note est dans la plage autorisée
        assertEquals(7.5, Calcul.noteBornee(7.5, 0.0, 10.0), 0.001);
    }

    @Test
    public void testSomme() {
        assertEquals(5, Calcul.somme(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(4, Calcul.division(8, 2));
    }

   @Test
    public void testDivisionByZero() {
        try {
            Calcul.division(10, 0);
            fail("La méthode division aurait dû lever une IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Succès : l'exception attendue a été levée
            assertTrue(true);
        }
    }
}

