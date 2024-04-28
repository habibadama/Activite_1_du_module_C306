
public final class Calcul {
    /**
     * Constructeur protégé avec une RuntimeException
     * pour empêcher l'instantiation de la classe.
     */
    private Calcul() {
        throw new RuntimeException("Cette classe ne peut pas être instanciée");
    }

    /**
     * Calcule la somme de deux nombres.
     *
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La somme des deux nombres.
     */
    public static int somme(final int a, final int b) {
        return a + b;
    }

    /**
     * Renvoie la note bornée par les valeurs min et max.
     *
     * @param note La note à borner.
     * @param min  La valeur minimale.
     * @param max  La valeur maximale.
     * @return La note bornée.
     */
    public static double noteBornee(final double note, final double min, final double max) {
        if (note >= max) {
            return max;
        }
        if (note <= min) {
            return min;
        }
        return note;
    }

    /**
     * Effectue une division entre deux nombres.
     *
     * @param a Le dividende.
     * @param b Le diviseur.
     * @return Le résultat de la division.
     * @throws IllegalArgumentException Si le diviseur est égal à zéro.
     */
    public static int division(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne doit pas être zéro");
        }
        return a / b;
    }
   
}
