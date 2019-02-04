package courHeritage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String lang[] = new String[2];
        String type;
        Info info;
        RO ro;
        Theo theo;
        Prati prati;
        String[] tab = {"Informatique","RO","Theorique","Pratique"};
        List<double[]> list = new ArrayList<>();
        for (String tb : tab ) {
            System.out.println("\t"+tb);
            System.out.println("Saisir note d'hiver puis note d'ete");
            list.add(new double[] {sc.nextDouble(),+sc.nextDouble()});
        }
        info = new Info(tab[0],list.get(0)[0],list.get(0)[1],"JAVA");
        ro = new RO(tab[1],list.get(1)[0],list.get(1)[1],"C++");
        theo = new Theo(tab[2],list.get(2)[0],list.get(2)[1],"DS");
        prati = new Prati(tab[3],list.get(3)[0],list.get(3)[1]);

        double moy = (info.calculMoyen()+ro.calculMoyen()+theo.calculMoyen()+prati.calculMoyen())/4;
        System.out.println("votre moyenne totale est : " +moy);
    }
}
