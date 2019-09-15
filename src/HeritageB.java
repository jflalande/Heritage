/**
 * Une classe B héritant de A.
 ∗ (Exemple de "Java en concentré", D. Flanagan)
 */
public class HeritageB extends HeritageA {
    int i = 2; // Masque le champ i de A
    int f() { return -i; } // Redéfinit la méthode f de A
    static char g() { return 'B'; } // Masque la méthode de classe de A
}