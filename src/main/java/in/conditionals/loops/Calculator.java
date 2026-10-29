package in.conditionals.loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0;

        // take input from user till user does not press X or x;
        while (true) {

            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.println();

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                // FIX: Useless checks se bachne ke liye 'else if' use kiya
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error division");
                        System.out.println();
                        continue;
                    }
                } else if (op == '%') { // FIX: Ab yeh '/' ke bahar azaad hai
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Can not perform modulo");
                        System.out.println();
                        continue;
                    }
                }

                // FIX: Print statement ab sahi jagah hai
                System.out.println("Result: " + ans);
                System.out.println();

            } else {
                System.out.println("Invalid Operator");
                System.out.println();
            }
        }
        sc.close();
    }
}
