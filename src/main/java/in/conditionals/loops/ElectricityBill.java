package in.conditionals.loops;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int billCharge=0;
        int units= sc.nextInt();
        if(units>0){
             billCharge= units*10;
        } else if (units<100) {
             billCharge= units*12;
        }
        else if(units<100 && units<500){
            billCharge= units*14;
        } else {
            System.out.println("Bill not generated");
        }
    }
}
