/** Appel aux méthodes/attributs parents et méthodes finales. */
public class SDF extends Homme {
    // Redéfinition
    public int richesse;
    public final int num_secu_social;

    public SDF(String naissance) {
        super(naissance);
        num_secu_social = 179;
        num_secu_social = 12; // impossible
    }

    final protected void remplirPoches(String s) {
        super.richesse = 0;
        richesse = 0;
        poches = "";
    }
}