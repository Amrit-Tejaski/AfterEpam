package in.conditionals.loops;

public class SubtractProductAndSum {


    static int subtractionProductAndSum(int n) {
        int sum = 0;
        int product=1;

        while (n > 0) {
            int digit = n % 10; // आखरी अंक बाहर निकाला (जैसे 234 में से 4)

            sum += digit;       // जोड़ में प्लस किया
            product *= digit;   // गुणा में मल्टीप्लाई किया

            n = n / 10;         // आखरी अंक को नंबर से डिलीट किया (अब बचा 23)
        }
        return product-sum;
    }

    public static void main(String[] args) {
        int num = 243;
        int result = subtractionProductAndSum(num);
        System.out.println(result);

    }

}
