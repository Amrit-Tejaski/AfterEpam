package in.first_java;

import java.util.Scanner;

public class NumberIsEvenOrOdd {


    static int checkEvnenOdd(int num){

        if(num % 2 == 0){

            System.out.println("Even number :"+ num);
        } else {
            System.out.println("Odd number :"+ num);
        }
        return num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        int i = checkEvnenOdd(number);
        System.out.println(i);

    }
}
