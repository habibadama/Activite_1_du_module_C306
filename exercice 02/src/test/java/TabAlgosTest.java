import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TabAlgosTest {

    @Test
    void testPlusGrand() {
        int[] tab = {12, 8, 94, 4, 1};
        assertEquals(94, TabAlgos.plusGrand(tab));
    }

    @Test
    void testMoyenne() {
        int[] tab = {67, 2, 10, 83, 5};
        assertEquals(33.4, TabAlgos.moyenne(tab));

       // Cas de test avec un tableau vide
        int[] tab1 = {};
        try {
            TabAlgos.moyenne(tab1);
            fail("Une IllegalArgumentException aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // 
        }
      // Cas de test avec un tableau null
        int[] tab2 = null;
        try {
            TabAlgos.moyenne(tab2);
            fail("Une IllegalArgumentException aurait dû être levée");
        } catch (IllegalArgumentException e) {
            // 
        }
    }

    @Test
    void testEgaux() {
        int[] tab1 = {8, 7, 6, 5, 4};
        int[] tab2 = {8, 7, 6, 5, 4};
        assertTrue(TabAlgos.egaux(tab1, tab2));

        int[] tab3 = {4, 6, 5, 7, 8};
        assertFalse(TabAlgos.egaux(tab1, tab3));
    }

    @Test
    void testSimilaires() {
	int[] tab1 = {1, 2, 2, 3};
	int[] tab2 = {3, 2, 1, 2};
	assertTrue(TabAlgos.similaires(tab1, tab2));

	int[] tab3 = {1, 2, 1, 2};
	assertFalse(TabAlgos.similaires(tab1, tab3));
    }
}
