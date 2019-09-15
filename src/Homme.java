public class Homme {
    private String nom;
    protected String poches;
    public int richesse;
    public Homme(String naissance){
        nom = naissance;
    }
    protected void remplirPoches(String s) {
        poches = new String(s);
    }
  }