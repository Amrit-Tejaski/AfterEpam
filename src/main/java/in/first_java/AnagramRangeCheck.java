package in.first_java;

import java.util.Scanner;

public class AnagramRangeCheck {

    static boolean isAnagram(int num){

        int originalNum = num;
        int result = 0;
        while (num != 0){

            int digit = num%10;
            result= result+(digit*digit*digit);
            num = num/10;
        }
        return originalNum== result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. यूज़र से रेंज इनपुट लेना
        System.out.print("Enter Start Number (e.g., 100): ");
        int start = sc.nextInt();

        System.out.print("Enter End Number (e.g., 1000): ");
        int end = sc.nextInt();
        System.out.println("\nArmstrong numbers between " + start + " and " + end + " are:");
        boolean found = false;

        for(int i = start; i<=end; i++){
            if(isAnagram(i)){
                System.out.println(i+"  ");
                found= true;
            }
        }

        if(found){
            System.out.println("Armstrong number found in this range.");
        } else {
            System.out.println("No Armstrong number found in this range.");
        }


    }

}
