package courHeritage;

public abstract class Cour {

    private String nom;
    private double noteDiver;
    private double noteDete;

    public Cour(String nom, double noteDiver, double noteDete) {
        this.nom = nom;
        this.noteDiver = noteDiver;
        this.noteDete = noteDete;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNoteDiver() {
        return noteDiver;
    }

    public void setNoteDiver(double noteDiver) {
        this.noteDiver = noteDiver;
    }

    public double getNoteDete() {
        return noteDete;
    }

    public void setNoteDete(double noteDete) {
        this.noteDete = noteDete;
    }

    public double calculMoyen(){
        return ((noteDete+noteDiver)/2);
    }
}
