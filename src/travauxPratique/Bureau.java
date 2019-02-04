package travauxPratique;

import java.util.ArrayList;
import java.util.List;

public class Bureau {

    private int code;
    private String nom;
    private List<Chercheur> chercheur;
    static int nmBureau;

    public Bureau() {
        chercheur = new ArrayList<>();
        nmBureau++;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Chercheur> getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        if (Chercheur.nbChercheur <= 5)
            this.chercheur.add(chercheur);
    }

    @Override
    public String toString() {
        System.out.println("Le nom du Bureau " + nom);
        System.out.println("Le code du bureau " + code);
        for (int counter = 1; counter <= chercheur.size(); counter++) {
            System.out.println("Le chercheur " + counter);
            System.out.println("\t" + chercheur.get(counter-1));
        }
        System.out.println();
        return super.toString();
    }
}
