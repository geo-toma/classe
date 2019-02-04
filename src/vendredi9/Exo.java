package vendredi9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exo {

    Scanner sc = new Scanner(System.in);

    public void exo1() {
        long max = 4000000;
        int a = 2;
        int b = 1;
        int c;
        int sum = 0;
        for (int couter = 0; couter < max; couter++) {
            c = a;
            a = a + b;
            b = c;
            if (a % 2 == 0)
                sum = sum + a;
        }
        System.out.println(sum);
    }

    public void firstCharNoRepeat() {
        String var = sc.nextLine();
        int sum;
        for (int i = 0; i <= var.length() - 1; i++) {
            sum = 0;
            for (int a = 0; a <= var.length() - 1; a++) {
                if (var.charAt(i) != var.charAt(a))
                    sum += 1;
            }
            if (sum == var.length() - 1) {
                System.out.println(var.charAt(i));
                break;
            }
        }
    }

    public void test() {
        String var = sc.nextLine();
        int sum = 0;
        int sum2 = 0;
        for (int counter = 0; counter < var.length(); counter++) {
            switch (var.charAt(counter)) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 1;
                    sum2 += 1;
                    break;
                case 'u':
                    sum += 1;
                    break;
                case 'o':
                    sum += 1;
                    break;
                case 'i':
                    sum += 1;
                    break;
                case 'y':
                    sum += 1;
                    break;
            }
        }
        System.out.println("le nombre de 'e' dans la phrase est : " + sum2);
        System.out.println("le nombre de voyelle dans la phrase est :" + sum);
    }

    public double arrondi(double a, int b) {
        return (double) ((int) (a * Math.pow(10, b) + 0.5)) / Math.pow(10, b);
    }

    public void convertTemp() {
        System.out.println("CNVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("________________________________________________");
        double convert;
        int response = -1;
        Boolean test = false;
        char testResp;
        do {
            do {
                System.out.println("\nChoisissez le mode de convertion :\n");
                System.out.println("1 - convertisseur degres celsius - fahrenheit");
                System.out.println("2 - convertisseur degres fahrenheit - celsius");
                try {
                    response = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.next();
                }
                if (response < 1 || response > 2)
                    System.out.println("Vous n'avez pas choisi une bonne reponse. Entrez (1) ou (2) selon ce que vous allez convertir");
            } while (response < 1 || response > 2);
            System.out.println("Temperature a convertir :");
            double temperature = sc.nextDouble();
            switch (response) {
                case 1:
                    convert = (9 * temperature / 5 + 32);
                    System.out.println(arrondi(temperature, 2) + " °C correspond a : " + arrondi(convert,2) + " °F.");
                    break;
                case 2:
                    convert = (5 * (temperature - 32) / 9);
                    System.out.println(arrondi(temperature, 1) + " °F correspond a : " + arrondi(convert,2) + " °C.");
                    break;
            }
            do {
                System.out.println("Souhaitez-vous convertir une autre temperture ? (O/N)");
                testResp = sc.next().charAt(0);
                if (testResp != 'O' && testResp != 'N')
                    System.out.println("Repondez svp par 'O' pour (oui) et 'N' pour (non)");
                else if (testResp == 'O')
                    test = true;
            } while (testResp != 'O' && testResp != 'N');
        } while (test);
    }

    public void useOfList(){
        List<String> list = new ArrayList<>();
        list.add(1+","+2);
        list = new ArrayList<>();
        list.add("non");
        System.out.println(list.get(0)+" "+list.size());
    }

    public void produitMatrix(){
        System.out.println("Entrez le nombre de ligne de la matrix 1");
        int ligne1 = sc.nextInt();
        System.out.println("Entrez le nombre de colonne de la matrix 1");
        int colonne1 = sc.nextInt();
        int[][] tab1 = new int[ligne1][colonne1];
        for (int i = 0; i < ligne1; i++) {
            for (int j = 0; j < colonne1; j++){
                System.out.print("M1["+(i+1)+"]["+(j+1)+"] = ");
                tab1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Le nombre de ligne de la matrix 2 doit etre egale au nombre de colone de la matrix 1");
        System.out.println("On retien donc le valeur du nombre de colonne entrez pour la matrix 1\n");
        System.out.println("Entrez le nombre de colonne de la matrix 2");
        int colonne2 = sc.nextInt();
        int[][] tab2 = new int[colonne1][colonne2];

        for (int i = 0; i < colonne1; i++) {
            for (int j = 0; j < colonne2; j++){
                System.out.print("M1["+(i+1)+"]["+(j+1)+"] = ");
                tab2[i][j] = sc.nextInt();
            }
        }
        int[][] tab = new int[ligne1][colonne2];
        for (int i = 0; i < ligne1; i++) {
            for (int j = 0; j < colonne2; j++) {
                tab[i][j] = 0;
                for (int k = 0; k < colonne1 ; k++) {
                    tab[i][j] += tab1[i][k]*tab2[k][j];
                }

            }

        }
        int var = ligne1 > colonne1? ligne1 : colonne1;
        for (int i = 0; i < var; i++) {
            /*if (i < ligne1) {
                for (int j = 0; j < colonne1; j++) {
                    if (j == 0) {
                        if (colonne1 == 1)
                            System.out.print("| " + tab1[i][j] + " | ");
                        else
                            System.out.print("| " + tab1[i][j] + " , ");
                    }
                    else if (j == colonne1 - 1)
                        System.out.print(tab1[i][j] + " |");
                    else
                        System.out.print(tab1[i][j] + " , ");
                } // affiche les lignes de la premiere matrix
            }

            if (i == var/2)
                System.out.print(" x ");
            else
                System.out.print("   ");

            if (i < colonne1) {
                for (int j = 0; j < colonne2; j++) {
                        if (j == 0) {
                            if (colonne2 == 1)
                                System.out.print("| " + tab2[i][j] + " | ");
                            else
                                System.out.print("| " + tab2[i][j] + " , ");
                        } else if (j == colonne2 - 1)
                            System.out.print(tab2[i][j] + " |");
                        else
                            System.out.print(tab2[i][j] + " , ");
                } // affiche les lignes de la deuxieme matrix
            }

            if (i == var/2)
                System.out.print(" = ");
            else
                System.out.print("   ");*/

            if (i < ligne1) {
                for (int j = 0; j < colonne2; j++) {
                    if (j == 0) {
                        if (colonne2 == 1)
                            System.out.print("| " + tab[i][j] + " | ");
                        else
                            System.out.print("| " + tab[i][j] + " , ");
                    }
                    else if (j == colonne2 - 1)
                        System.out.print(tab[i][j]+ " |");
                    else
                        System.out.print(tab[i][j]+ " , ");
                } // affiche la reponse
            }
            System.out.println();
        }
    }

    public int findMin(int a, int b){
        return (a<b?a:b);
    }

    public int[] findDoublon(int[] tab){
        int longeur = 1;
        for (int i = 0; i <tab.length - 1 ; i++) {
            if (tab[i++] != tab[i--])
                longeur += 1;
        }
        int[] tab1 = new int[longeur];
        tab1[0] = tab[0];
        int j = 1;
        for (int i = 0; i <tab.length - 1 ; i++) {
            if (tab[i++] != tab[i--]) {
                tab1[j++] = tab[++i];
                i--;
            }
        }
        return tab1;
    }

    public boolean palindrome(int num){
        int inv=0;
        int temp=num;
        boolean test;
        while (num!=0) {
            int r=num%10;
            num=num/10;

            inv=(inv *10)+r;

        }
        if (temp==inv) {
            System.out.println("C'est un palindrome");
            test = true;
        }else {
            System.out.println("Ce n'est pas un palindrome");
            test = false;
        }

        return test;
    }

    public void searchPalindrome(){

    }

    public void transposerMatrix(int[][]tab){
       // int[][] tab1 = new int[3][3];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(tab[j][i]+" ");
            }
            System.out.println();
        }
    }

    public void transposerMatrix(int[][]tab,int a){
       // int[][] tab1 = new int[3][3];

        for (int i = 2; i >= 0 ; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[j][i]+" ");
            }
            System.out.println();
        }
    }
}
