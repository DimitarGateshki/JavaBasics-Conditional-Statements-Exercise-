package Time15Minutes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int chas=Integer.parseInt(scan.nextLine());
        int minA=Integer.parseInt(scan.nextLine());
        int minf=minA+15;


        if(minf>=60){
            chas=chas+1;
            minf=minf-60;
        }
        if(chas>23){
            chas=0;
        }
        if(chas<10 && minf<10 && chas>0){
            System.out.printf("%d:0%d",chas,minf);
        }else if(chas<10 && minf>10 && chas>0){
            System.out.printf("%d:%d",chas,minf);
        }else if(chas>10 && minf<10) {
            System.out.printf("%d:0%d", chas, minf);
        }else if(chas>10 && minf>10) {
            System.out.printf("%d:%d", chas, minf);
        }else if(  minf>10 && chas==0) {
            System.out.printf("%d:%d", chas, minf) ;
        }else if(  minf<10 && chas==0) {
            System.out.printf("%d:0%d", chas, minf);
        }else if (chas>10 && minf>9){
            System.out.printf("%d:%d", chas, minf) ;

        }




    }
}
