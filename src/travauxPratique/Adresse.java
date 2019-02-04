package travauxPratique;

public class Adresse {

    private String pays;
    private String ville;
    private int codePostal;

    public Adresse() {
        pays= " maroc ";
        ville= " rabat";
        codePostal= 10090;
    }

    public Adresse(String pays, String ville, int codePostal) {
        this.pays = pays;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    @Override
    public String toString() {
        System.out.println("Pays :"+pays);
        System.out.println("Ville :"+ville);
        System.out.println("Code postale :"+codePostal);
        System.out.println();
        return super.toString();
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
}
