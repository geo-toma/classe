package travauxPratique;

public class Main {
    public static void main(String[] args) {

        Adresse adresse= new Adresse();
        adresse.setPays("France");
        adresse.setVille("Paris");
        adresse.setCodePostal(10020);
        System.out.println(adresse);
        adresse.setCodePostal(10094);
        System.out.println();
        System.out.println(adresse);

        Adresse adresse1 = new Adresse("Togo","Lome",1200);
        adresse1.setVille("Kara");
        System.out.println();
        System.out.println(adresse1);
    }


}
