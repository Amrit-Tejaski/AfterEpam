package in.conditionals.loops;

import java.util.Map;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

       /* int max = a;

        if(b>max){
             max= b;
        }
        if (c>max){
            max= c;
        }
            System.out.println("largest no print : "+max);
        }*/


        int max= Math.max(Math.max(a,b), c);
        System.out.println("largest no print : "+max);

    }
}
