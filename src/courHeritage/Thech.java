package courHeritage;

public abstract class Thech extends Cour {

    private String langage;

    public Thech(String nom, double noteDiver, double noteDete, String langage) {
        super(nom, noteDiver, noteDete);
        this.langage = langage;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }
}
