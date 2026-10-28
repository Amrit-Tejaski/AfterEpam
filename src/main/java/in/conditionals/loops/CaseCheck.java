package in.conditionals.loops;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String trim = sc.next().trim();
        char c = sc.next().trim().charAt(0);
        //System.out.println(trim);

        if(c>='a' && c<='z'){
            System.out.println("lowercase:"+c);
        } else {
            System.out.println("this is Upper Case");
        }

    }
}
