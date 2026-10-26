package in.coderarmy;

import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Numbers enter karte jayein (Rukne ke liye 'x' dabayein):");

        // अनंत लूप (Infinite Loop) जो 'x' आने पर ही टूटेगा
        while (true) {
            String input = sc.next(); // इनपुट को String की तरह लिया

            // अगर यूज़र ने 'x' या 'X' दबाया है, तो लूप से बाहर निकल जाओ
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            // अगर 'x' नहीं है, तो String को Integer में बदलकर sum में जोड़ो
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Valid number ya 'x' enter karein!");
            }
        }

        // आखिरी में कुल जोड़ प्रिंट करें
        System.out.println("Sabhi numbers ka kul sum hai: " + sum);
        sc.close();
    }
}
