package in.coderarmy;

public class MultiplicationTable {

    static int multitable(int x) {
        int sum = 0;

        // लूप को 1 से 10 तक चलाएं
        for (int i = 1; i <= 10; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);
            sum += result; // सभी रिजल्ट्स का सम (जोड़) करने के लिए
        }

        return sum; // टेबल की सभी संख्याओं का कुल जोड़ वापस करेगा
    }


    public static void main(String[] args) {
        int x= 5;
        System.out.println(multitable(5));
    }
}
