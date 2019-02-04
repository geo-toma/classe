package courHeritage;

public class Theo extends Cour{

    String typeExam;

    public Theo(String nom, double noteDiver, double noteDete, String typeExam) {
        super(nom, noteDiver, noteDete);
        this.typeExam = typeExam;
    }
}
