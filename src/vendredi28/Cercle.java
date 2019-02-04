package vendredi28;

public class Cercle {

    public double x;
    public double y;
    private double rayon ;

    public double surface(){

        return (3.14*rayon*rayon);
    }

    public double circonference(){
        return  2*3.14*rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
