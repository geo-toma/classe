package travauxPratique;

public class Test {

    public static void main(String[] args) {

        Adresse adresse= new Adresse();
        adresse.setPays("France");
        adresse.setVille("Paris");
        adresse.setCodePostal(10020);
        //System.out.println(adresse);

        Chercheur chercheur = new Chercheur();
        chercheur.setNom("georges");
        chercheur.setNumOrdi(57);
        chercheur.setPoste(3);
        //System.out.println(chercheur);

        Chercheur chercheur1 = new Chercheur("jack",6,38);
        //System.out.println(chercheur1);

        chercheur.setNumOrdi(62);

        Chercheur chercheur2 = new Chercheur();
        chercheur2.setNom("david");
        chercheur2.setNumOrdi(19);
        chercheur2.setPoste(2);

        Bureau bureau = new Bureau();
        bureau.setChercheur(chercheur);
        bureau.setChercheur(chercheur1);
        bureau.setChercheur(chercheur2);

        Bureau bureau1 = new Bureau();
        bureau1.setChercheur(new Chercheur("serges",7,21));
        bureau1.setChercheur(new Chercheur("reine",12,210));
        bureau1.setChercheur(new Chercheur("serges",17,26));

        Laboratoire laboratoire = new Laboratoire("tech","physique chimie",adresse);
        laboratoire.setBureaus(bureau);
        laboratoire.setBureaus(bureau1);
        System.out.println(laboratoire);
    }


}
