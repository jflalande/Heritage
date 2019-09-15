/**
 *La redéfinition de remplirPoches est impossible à cause du final.
 */
public class SDF2 extends SDF {
    public int num_secu_social; // possible !
    private String habitation = "carton"; // implicitement final
    public SDF2(String naissance) {
        super(naissance);
        super.num_secu_social = 0; // impossible !
        num_secu_social = 0;
    }
    protected void remplirPoches(String s) { // impossible !
        super.remplirPoches(s + " + 1 euro.");
    }
}