package in.first_java;

import java.util.Scanner;

public class NameAsInputAndPrintAGreetingMessage {

    static String nameAsInputAndPrintAGreetingMessage(String str){


        return str+" "+"Welcome";
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        String s = nameAsInputAndPrintAGreetingMessage(name);
        System.out.println(s);
    }
}
