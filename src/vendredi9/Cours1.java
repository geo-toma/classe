package vendredi9;

import java.util.Scanner;

public class Cours1 {

    Scanner sc = new Scanner(System.in);

    public void useOfFor(){
        for (int counter = 7; counter >= 1; counter--){
            for (int a = 1; a <= 7; a++){
                if (a%2 != 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int counter = 0; counter <= 7; counter++){
            for (int a = 0; a <= 7 - counter; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void useOfWhile(){
        int counter = 0;
        while (counter < 7){
            int a = 0;
            while (a < 7 - counter){
                System.out.print("*");
                a++;
            }
            System.out.println();
            counter += 1;
        }
    }

    public void useOfDoWhile(){
        int counter = 0;
        do {
            int a = 0;
            do {
                System.out.print("*");
                a++;
            } while (a < 7 - counter);
            System.out.println();
            counter += 1;
        } while (counter < 7);
    }

    public void testWhile(){
        int a =1;
        int b =1;
        while (a!=0 && b!=0){
            System.out.println("a ou b est zero");
            b--;
        }
    }

    public void useOfBreak(){
        for(int i = 1; i <= 10; i++){
            if (i % 2 == 0)
                continue;
            System.out.println("on passe le tour "+i);
        }
    }

    public void motPalindromme(){
        String var = sc.nextLine();
        String inv = "";
        for (int counter = var.length(); counter >= 1 ; counter--){
            inv += var.charAt(counter - 1);
        }
        System.out.println(inv);
    }
}
