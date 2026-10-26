package in.coderarmy;

public class LeapYear {
    public static void main(String[] args) {

        int year = 20000;

        if ((year % 4 == 0 && year %100 != 0) || (year%400==0)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
