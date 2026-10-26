package in.first_java;

import java.util.Scanner;

public class Tw0NumberCompareLargestNumber {

    static void checkLargest(int a, int b){

        if(a<b){
            System.out.println(" Largest nnumber is :"+ b);
        } else if (a>b) {
            System.out.println("Largest number : "+ a);
        } else
        {
            System.out.println("invalid Largest");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        checkLargest(num1, num2);
    }
}
