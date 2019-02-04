package vendredi9;

import java.util.Scanner;

public class Convertion {

    Scanner sc = new Scanner(System.in);

    int years, months, days, hours, min;

    public void convert(){
        int minute = sc.nextInt();
        years = minute/525600;
        months = (minute%525600)/(30*24*60);
        days = ((minute%525600)%(30*24*60))/(24*60);
        int i = ((minute % 525600) % (30 * 24 * 60)) % (24 * 60);
        hours = i /60;
        min = (i %60);
        System.out.println(minute+" min = "+years+" ans "+months+" mois "+days+" jours "+hours+" heures "+min+" min");
    }

    public void testCast(){
        char var1 = '0';
        char var2 = 1;
        int response = Integer.valueOf(var1);
        System.out.println(response);
    }

    public void somme(){
        int nombre = sc.nextInt();
        int chiffre1 = nombre/100;
        int chiffre2 = (nombre - chiffre1*100)/10;
        int chiffre3 = ((nombre - chiffre1*100) - chiffre2*10);
        int response = chiffre1+chiffre2+chiffre3;
        System.out.println("la somme de chaque lettre est : "+response);
    }

    public void eCounter() {
        String var = sc.nextLine();
        int sum = 0;
        for (int counter = 0; counter < var.length(); counter++){
            if (var.charAt(counter) == 'e'){
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public void vowelCounter(){
        String var = sc.nextLine();
        int sum = 0;
        for (int counter = 0; counter < var.length(); counter++){
            if ("aeoiuy".contains(String.valueOf(var.charAt(counter)))){
                sum +=1;
            }
        }
        System.out.println(sum);
    }

    public void differentChar(){
        String var1 = sc.nextLine();
        String var2 = sc.nextLine();
        String var = "";
        int sum;
        int sum2 = 0;
        for (int i = 1; i <= var1.length(); i++) {
            sum = 0;
            int a;
            for (a = 1; a <= var2.length(); a++) {
                if (var1.charAt(i - 1) == var2.charAt(a - 1))
                    break;
                sum += 1;
            }
            a = a - i;
            if (sum == var2.length()) {
                sum2 += 1;
                var += var1.charAt(i - 1) + ";";
            }
        }
        System.out.println("les deux phrases conteinnent "+sum2+" caracteres differents qui sont \n"+var);
    }
}
