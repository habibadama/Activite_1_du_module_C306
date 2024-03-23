public class Produit {
    private final String reference;
    private double prix; // Retirer le mot-clé final pour permettre la modification du prix
    private static final double TVA = 0.20;

    public Produit(String reference, double prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public double getPrix() {
        return this.prix * (1 + TVA);
    }

     // Correction: Retirer le mot-clé final pour permettre la modification du prix
     public void setPrix(double prix) {
        this.prix = prix;
    }
    
    /**
     * @return la reference si le prix est positif, null sinon
     */
    public final String getReference() {
        if (prix > 0) {
            return reference;
        } else {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        String resultat = reference;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        return reference.equals(produit.reference);
    }
}


