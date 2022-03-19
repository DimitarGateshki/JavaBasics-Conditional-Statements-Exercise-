package WorldSwimmingRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timePerM = Double.parseDouble(scan.nextLine());

        double IvanTime=distance*timePerM;
        double delay=Math.floor(distance/15)*12.5;
        double total=IvanTime+delay;
        if (total<record)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        }else
        {
            double needTime=total-record;
            System.out.printf("No, he failed! He was %.2f seconds slower.",needTime);
        }

    }
}
