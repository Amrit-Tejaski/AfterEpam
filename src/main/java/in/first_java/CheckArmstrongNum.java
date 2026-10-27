package in.first_java;

public class CheckArmstrongNum {

    static void isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        while(num!= 0){
        int digit = num%10; // yaha se hum last digit 3 ko nikal rahe hain
        result= result+(digit*digit*digit); // nikale huye 3 digit ko cube bna rahe hain
        num = num/10; // ye remove kr raha hai current place se

        }
        if(originalNum==result){
            System.out.println(originalNum+ " "+":is Armstrong num");
        } else {
            System.out.println(originalNum+ "" +": is Not ArmStrong num");
        }
    }

    public static void main(String[] args) {
        int num = 153;
       isArmstrong(num);
    }
}
