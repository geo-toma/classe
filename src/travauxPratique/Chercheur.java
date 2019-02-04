package travauxPratique;

public class Chercheur {

    private String nom;
    private int poste,numOrdi;
    static int nbChercheur;

    public Chercheur() {
        nbChercheur++;
    }

    public Chercheur(String nom, int poste, int numOrdi) {
        this.nom = nom;
        this.poste = poste;
        this.numOrdi = numOrdi;
        nbChercheur++;
    }

    @Override
    public String toString() {
        System.out.println("Cheurcheur "+nbChercheur);
        System.out.println("Nom :"+nom);
        System.out.println("Poste :"+poste);
        System.out.println("numero d'ordinateur :"+numOrdi);
        System.out.println();
        return super.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoste() {
        return poste;
    }

    public void setPoste(int poste) {
        this.poste = poste;
    }

    public int getNumOrdi() {
        return numOrdi;
    }

    public void setNumOrdi(int numOrdi) {
        this.numOrdi = numOrdi;
    }

    public boolean comparer(Chercheur chercheur){
        if (chercheur.nom == this.nom && chercheur.numOrdi == this.numOrdi && chercheur.poste == this.poste){
            return true;
        }
        return false;
    }
}
