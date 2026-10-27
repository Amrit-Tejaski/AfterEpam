package in.conditionals.loops;

public class PrintFactorOfnumber {


   static int  printFactor(int num){
       int sum = 0;
       for(int i = 1; i<num; i++){
            if(num % i ==0){
                sum = sum+i;
            }
       }
       return sum;

   }

    public static void main(String[] args) {
        int num = 12;
        int i = printFactor(num);
        System.out.println(i);
    }
}
