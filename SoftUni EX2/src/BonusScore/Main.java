package BonusScore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startP = Integer.parseInt(scan.nextLine());
        double bP = 0;
        if (startP <= 100) {
            bP = 5;

        } else if (startP > 100 && startP <= 1000) {
            bP = startP * 0.2;
        } else {
            bP = startP * 0.1;

        }

        if (startP % 2 == 0) {
            bP = bP + 1;
        } else if (startP % 10 == 5) {
            bP = bP + 2;

        }
        double fP = startP + bP;
        System.out.printf("%.1f %n", bP);
        System.out.printf("%.1f", fP);
    }
}
