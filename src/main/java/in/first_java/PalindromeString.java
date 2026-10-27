package in.first_java;

public class PalindromeString {

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = false;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // अगर एक भी अक्षर अलग मिला, तो पैलिंड्रोम नहीं है
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "raceCar";
       boolean result = isPalindrome(str.toLowerCase());
       System.out.println(result);

    }
}
