package vendredi28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        Caractere caractere = new Caractere();

        caractere.setCaract(a);
        caractere.suivant();
        System.out.println("Le caractere suivant est "+caractere.getCaract());

        caractere.setCaract(a);
        caractere.precedent();
        System.out.println("Le caractere precedent est "+caractere.getCaract());
    }
}
