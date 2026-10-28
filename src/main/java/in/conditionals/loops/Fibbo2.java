package in.conditionals.loops;

import java.util.Scanner;

public class Fibbo2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int start= 0;
         int end = 1;
        int result= 0;
        while(num!= 0) {
            System.out.println(start+"  ");

              result = start+end;
             start= end;
             end= result;
             num--;
         }

    }
}
