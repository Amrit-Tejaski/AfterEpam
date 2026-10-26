package in.coderarmy;

import java.util.Scanner;

public class CheckPrimeNumOptimized {

    static boolean isprime(int num) {
        boolean isPrime = true;

        if (num <= 1) {
            return isPrime = false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                 isPrime = false;
                break;
            }
            c += 1;
        }
        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isprime = isprime(number);
        System.out.println(isprime);
    }

}
