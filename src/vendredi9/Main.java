package vendredi9;

public class Main {
    public static void main(String[] args) {

        Cours1 cours1 = new Cours1();
        Convertion convertion = new Convertion();
        Cours cours = new Cours();
        Exo exo = new Exo();

        //cours1.motPalindromme();
        //cours1.useOfBreak();
        //cours1.testWhile();
        //cours1.useOfDoWhile();
        //cours1.useOfWhile();
        //cours1.useOfFor();

        //convertion.convert();
        //convertion.testCast();
        //convertion.somme();
        //convertion.eCounter();
        //convertion.vowelCounter();
        //convertion.differentChar();

        //cours.formeDeCondition();
        //cours.useOfIf();
        //cours.useOfSwitch();
        cours.varAleatoire();
        //cours.tableau2();
        //cours.tableau1();
        //cours.tableauTrie();

        //exo.exo1();
        //exo.firstCharNoRepeat();
        //exo.test();
        //exo.convertTemp();

        //cours.addictionMatrix();
        //exo.produitMatrix();

        /*for (int i = 0; i < exo.findDoublon(new int[]{2, 2, 3, 4, 6, 6, 6, 8, 9, 9}).length; i++) {
            System.out.print(exo.findDoublon(new int[]{2,2,3,4,6,6,6,8,9,9})[i]+" ");
        }
        System.out.println();
        System.out.println("la taille du tableau sans doublon "+exo.findDoublon(new int[]{2,2,3,4,6,6,6,8,9,9}).length);

        }
        */
        /*int[][] tab = {{1,2,3},{4,5,6},{7,8,9}};
        exo.transposerMatrix(tab);
        System.out.println();
        exo.transposerMatrix(tab,1);*/
    }
}