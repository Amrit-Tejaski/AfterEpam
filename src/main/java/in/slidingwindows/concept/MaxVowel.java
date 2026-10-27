package in.slidingwindows.concept;

import java.util.stream.IntStream;

public class MaxVowel {
    static int maxVowel(String str, int k){

        int currentVowel= 0;
        if(str== null ||str.length()<k || k<=0){
            return 0;
        }
        
        for(int i = 0; i<k; i++){

            if(checkVowel(str.charAt(i))){
                currentVowel++;
            }
        }
        int maxVowel = currentVowel;

        for(int j = 1; j<=str.length()-k; j++){

            if(checkVowel(str.charAt(j-1))){
                currentVowel--;
            }
            if(checkVowel(str.charAt(j+k-1))){
                currentVowel++;
            }

            if(maxVowel<currentVowel){
                maxVowel= currentVowel;
            }
        }
        return maxVowel;


    }

    private  static boolean checkVowel(char c){
        return c=='a' || c=='e' ||c=='i'||c=='o' || c=='u';
    }



    public static void main(String[] args) {
        String str = "abciiidef";
        int k = 3;
       // Output: 3 sbse lamba iii hai esliy 3
        System.out.println(maxVowel(str, k));
    }
}
