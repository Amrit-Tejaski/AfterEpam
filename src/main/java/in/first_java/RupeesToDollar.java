package in.first_java;

import java.util.Scanner;

public class RupeesToDollar {


    public static void main(String[] args) {

        System.out.println("Currency conversion");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in rupees: ");
        double rupees = sc.nextDouble(); // पैसे पॉइंट्स में भी हो सकते हैं

        // वर्तमान डॉलर रेट के हिसाब से रुपये को डॉलर से डिवाइड करें
        double usdRate = 87.10;
        double dollar = rupees / usdRate;

        // printf का इस्तेमाल करके सिर्फ 2 डेसिमल प्लेस तक डॉलर प्रिंट करें
        System.out.printf("Total Amount in USD: $%.2f\n", dollar);



    }
}
