package SumSeconds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firt = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int all = firt + second + third;
        int min = all / 60;
        int sec = all % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);

        } else {
            System.out.printf("%d:%d", min, sec);

        }
    }
}
