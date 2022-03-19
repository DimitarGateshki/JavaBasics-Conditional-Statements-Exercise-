package GodzillaVsKong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double budget=Double.parseDouble(scan.nextLine());
        int statisti=Integer.parseInt(scan.nextLine());
        double cloate=Double.parseDouble(scan.nextLine());
        double decor=budget*0.1;
        double cloatesFP=statisti*cloate;
        if (statisti>150){
            cloatesFP=cloatesFP*0.9;
        }
        double price=cloatesFP+decor;
        double rest=0;
        if (budget>=price){
            rest=budget-price;
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",rest);
        }else {
            rest=price-budget;
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",rest);
        }






    }
}
