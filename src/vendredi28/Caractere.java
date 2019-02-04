package vendredi28;

public class Caractere {

    char caract;

    public char getCaract() {
        return caract;
    }

    public void setCaract(char caract) {
        this.caract = caract;
    }

    public void suivant(){
        int a = (int) caract;
        a++;
        this.caract = (char) a;
    }

    public void precedent(){
        int a = (int) caract;
        a--;
        this.caract = (char) a;
    }
}
