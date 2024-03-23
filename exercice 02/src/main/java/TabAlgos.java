import java.util.Arrays;

public final class TabAlgos {
    /** @return valeur la plus grande d'un tableau. */
    public static int plusGrand(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est null ou vide.");
        }
        
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * @return moyenne des valeurs du tableau.
     * @throw IllegalArgumentException si tab est null ou vide.
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est null ou vide.");
        }
        
        int sum = 0;
        for (int num : tab) {
            sum += num;
        }
        return (double) sum / tab.length;
    }

    // /** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
    //  * @return true si les 2 tableaux contiennent les mêmes éléments
    //  * avec les mêmes nombres d'occurences (avec les elements dans le meme ordre).
    //  **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null || tab1.length != tab2.length) {
            return false;
        }
        
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    // /** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
    //  * @return true si les 2 tableaux contiennent les mêmes éléments
    //  * avec les mêmes nombres d'occurrence (pas forcément dans le meme ordre).
    //  **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null || tab1.length != tab2.length) {
            return false;
        }
        
        int[] tab1Copy = tab1.clone();
        int[] tab2Copy = tab2.clone();
        
        Arrays.sort(tab1Copy);
        Arrays.sort(tab2Copy);
        
        for (int i = 0; i < tab1Copy.length; i++) {
            if (tab1Copy[i] != tab2Copy[i]) {
                return false;
            }
        }
        return true;
    }
    

}