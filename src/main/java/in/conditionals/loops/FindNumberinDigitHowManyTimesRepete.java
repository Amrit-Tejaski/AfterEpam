package in.conditionals.loops;

public class FindNumberinDigitHowManyTimesRepete {

    public static void main(String[] args) {

        int num = 1385757879;
        int count=0;
        while(num!= 0){

           long digit= num%10;
           num = num/10;

           if(digit==7){
               count++;
           }

        }
        System.out.println(count);
    }
}
