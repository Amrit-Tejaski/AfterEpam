package in.coderarmy;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter 1st number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a factor, so it's not prime
                    break;
                }
            }

        }

        if(isPrime){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
