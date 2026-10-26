package in.first_java;

import java.util.Scanner;

public class BasicCalculator {


    static void basicCal(int a, int b, char operator){
        boolean validOperator = true;
        int result = 0;

        if(operator == '+'){
            result= a+b;
        } else if (operator == '-') {
            result= a-b;
        } else if (operator == '*') {
            result= a*b;
        } else if (operator== '/'){
            result= a/b;
        } else {
             validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result: " + a + " " + operator + " " + b + " = " + result);
        }

    }

    public static void main(String[] args) {

        System.out.println(" Basic Calculator: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1= sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2= sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        basicCal(num1,num2,operator);

    }
}
