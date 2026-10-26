package in.first_java;

import java.util.Scanner;

public class FindSimpleIntrest {

    static double findSimpleIntrest(double p, float r, int t){
        double si= p*r*t/100;

        System.out.println("Simple Intrest Amount: "+ si);
        return si+p;
    }

    public static void main(String[] args) {
        System.out.println("Calculate Simple Intrest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate Of Intrest: ");
        float rate = sc.nextFloat();
        System.out.println("Enter Time or Years: ");
        int time = sc.nextInt();
        double TotalAmout = findSimpleIntrest(p, rate, time);
        System.out.println("Total Amount si+ amount:"+TotalAmout);



    }
}
