package in.coderarmy;

import java.util.Scanner;

public class HCFLCM {

    static  int calculateHcf(int a, int b){

        while(b!= 0){
            int temp = b;
            b = a%b;
            a = temp;

        }
        return a;
    }

    static int calculateLCM(int a, int b){
        int hcf = calculateHcf(a, b); // Pehle donon ka HCF nikalein
        int c= a*b;
        return c/hcf;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number:");
        int num1= sc.nextInt();
        System.out.println("Enter second Number:");
        int num2= sc.nextInt();
        System.out.println(calculateHcf(num1,num2));
        System.out.println(calculateLCM(num1,num2));
    }
}
