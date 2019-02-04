package vendredi9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cours {
    Scanner sc = new Scanner(System.in);

    public void varAleatoire() {
        /*Random rand = new Random(); // random genere des variable aleatoire
        int max = 10;
        int min = 5;
        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
        System.out.println(nombreAleatoire);*/
        int i=0;
        if (i++ == 2){
            System.out.println("rien");
        }
        System.out.println(i);
    }

    public void formeDeCondition() {
        int a = 10;
        int b = 20;
        int maxi;
        maxi = a > b ? a : b; // test la premiere expression et affecte a maxi la premiere ou la deuxieme selon que le test est vrai ou faux
        System.out.println(maxi);
    }

    public void useOfSwitch() {
        System.out.println(String.format("\nQuelle est la bonne reponse si l'on veut affecter une variable entiere a x ?\n "));
        System.out.println("a) int 1x = 10;");
        System.out.println("b) int x = 10;");
        System.out.println("c) float x = 10.0f;");
        System.out.println("d) string x = \"10\";");
        char response = sc.next().charAt(0);
        switch (response) {
            case 'a':
                System.out.println("Mauvaise reponse");
                break;
            case 'b':
                System.out.println("Bonne reponse");
                break;
            case 'c':
                System.out.println("Mauvaise reponse");
                break;
            case 'd':
                System.out.println("Mauvaise reponse");
                break;
            default:
                System.out.println("Vous n'avez pas choisi parmi les choix proposes");
                break;
        }
    }

    public void useOfIf() {
        System.out.println("Entrez votre age");
        int age = sc.nextInt();
        if (age < 18)
            System.out.println("you don't have right to vote, you've less than 18 years old");
        else
            System.out.println("you can vote, you've " + age + " years old");
    }

    public void tableau() {
        int[] tab;
        int sum = sc.nextInt();
       /* int min = tab[0];
        int max = tab[0];
        for (int tb : tab) {
            sum += tb;
            if (min > tb)
                min = tb;

            if (max < tb)
                max = tb;
        }
        System.out.println("le min est "+min+" le max est "+max+" et la sum est "+sum);*/
       tab = (sum == 0)? new int[]{1,1} : new int[] {0,0};

    }

    public void tableau1(){
        int[] tab = {12,15,13,10,8,9,13,14};
        int var = sc.nextInt();
        for (int i = 0; i < tab.length; i++){
            if (tab[i] == var){
                System.out.println("La valeur que vous avez entrez appartient au tableau");
                System.out.println("L'indice de cette valeur est "+i);
                break;
            }
            if (i == tab.length - 1)
                System.out.println("la valeur n'est pas dans ce tableau");
        }
    }

    public void tableau2(int a, int b){
        int[] tab = {12,15,13,10,8,9,13,14};
        int[] temptab = tab.clone();
        int temp = tab[a];
        tab[a]=tab[b];
        tab[b] = temp;
        for (int tb : temptab)
            System.out.print(tb+" ");
        System.out.println();
        for (int tb : tab)
            System.out.print(tb+" ");
    }

    public void tableauTrie(){
        int[] tab = {10,2,31,24,55,68,17,8,49};
        for (int tb : tab)
            System.out.print(tb+" ");
        System.out.println();
        for (int a = 0; a < tab.length; a++) {
            for (int i = a; i < tab.length; i++) {
                if (tab[i] < tab[a]) {
                    int temp = tab[a];
                    tab[a] = tab[i];
                    tab[i] = temp;
                }
            }
        }
        for (int tb : tab)
            System.out.print(tb+" ");
    }

    public void addictionMatrix(){
        System.out.println("Entrez le nombre de ligne de la matrix");
        int ligne = sc.nextInt();
        System.out.println("Entrez le nombre de colonne de la matrix");
        int colonne = sc.nextInt();
        int[][] tab1 = new int[ligne][colonne];
        int[][] tab2 = new int[ligne][colonne];
        System.out.println("entrez les coef de la matrix 1");
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++){
                System.out.print("M1["+(i+1)+"]["+(j+1)+"] = ");
                tab1[i][j] = sc.nextInt();
            }
        } // recupere la premiere matrix
        System.out.println("entrez les coef de la matrix 2");
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++){
                System.out.print("M2["+(i+1)+"]["+(j+1)+"] = ");
                tab2[i][j] = sc.nextInt();
            }
        } // recpere la deuxieme matrix

        for (int i = 0; i < ligne; i++) {
            /*for (int j = 0; j < colonne; j++){
                if (j == 0)
                    System.out.print("| "+tab1[i][j]+" , ");
                else if (j == colonne - 1)
                    System.out.print(tab1[i][j]+ " |");
                else
                    System.out.print(tab1[i][j]+" , ");
            } // affiche les lignes de la premiere matrix*/
          /*  if (i == ligne/2)
                System.out.print(" + ");
            else
                System.out.print("   ");
            for (int j = 0; j < colonne; j++){
                if (j == 0)
                    System.out.print("| "+tab2[i][j]+" , ");
                else if (j == colonne - 1)
                    System.out.print(tab2[i][j]+" |");
                else
                    System.out.print(tab2[i][j]+" , ");
            } // affiche les lignes de la deuxieme matrix*/
           /* if (i == ligne/2)
                System.out.print(" = ");
            else
                System.out.print("   ");*/
            for (int j = 0; j < colonne; j++){
                if (j == 0)
                    System.out.print("| "+(tab1[i][j]+tab2[i][j])+" , ");
                else if (j == colonne - 1)
                    System.out.print((tab1[i][j] + tab2[i][j]) + " |");
                else
                    System.out.print((tab1[i][j] + tab2[i][j]) + " , ");
            } // affiche la reponse
            System.out.println();
        }
    }


}
