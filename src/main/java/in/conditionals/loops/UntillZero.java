package in.conditionals.loops;

import java.util.Scanner;

public class UntillZero {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int sum = 0; // इसमें हम जोड़कर वैल्यू रखेंगे

        System.out.println("Numbers डालना शुरू करें (बंद करने के लिए 0 दबाएं):");

    // यह लूप तब तक चलता रहेगा जब तक ब्रेक (break) न हो
        while (true) {
        int num = sc.nextInt(); // लूप के अंदर हर बार नया नंबर मांगेगा

        if (num == 0) {
            break; // जैसे ही यूजर 0 दबाएगा, लूप तुरंत रुक जाएगा
        }

        sum = sum + num; // पुराने जोड़ में नया नंबर प्लस होता जाएगा
    }

    // लूप से बाहर आने के बाद कुल जोड़ प्रिंट होगा
        System.out.println("सभी नंबर्स का कुल जोड़ है: " + sum);
        sc.close();
    }
}
