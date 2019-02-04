package travauxPratique;

import java.util.ArrayList;
import java.util.List;

public class Laboratoire {

    private String nom, specialite;
    private Adresse adresse;
    private List<Bureau> bureaus;

    public Laboratoire() {
        bureaus = new ArrayList<>();
    }

    public Laboratoire(String nom, String specialite, Adresse adresse) {
        this.nom = nom;
        this.specialite = specialite;
        this.adresse = adresse;
        bureaus = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Bureau> getBureaus() {
        return bureaus;
    }

    public void setBureaus(Bureau bureau) {
        if (Bureau.nmBureau <= 50)
            this.bureaus.add(bureau);
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        System.out.println("Le nom du labo : " + nom);
        System.out.println("La specialite du labo : " + specialite);
        System.out.println("L'adresse du labo");
        System.out.println("\t"+adresse);
        for (int counter = 1; counter <= bureaus.size(); counter++) {
            System.out.println("Le bureau " + counter);
            System.out.println("\t" + bureaus.get(counter-1));
        }
        System.out.println();
        return super.toString();
    }
}
