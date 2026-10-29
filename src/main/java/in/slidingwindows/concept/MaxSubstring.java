package in.slidingwindows.concept;

import java.util.HashSet;
import java.util.Set;

public class MaxSubstring {

    static int maxlengthSubstring(String str){

        int left = 0;
        int maxLength= 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right<str.length(); right++){

            Character currentCharacter = str.charAt(right);
            while(set.contains(currentCharacter)){
                    set.remove(str.charAt(left));
                    left++;
            }
            set.add(currentCharacter);
            int window = right-left+1;

            if(window>maxLength){
                maxLength= window;
            }
        }
        return maxLength;
    }




    public static void main(String[] args) {

        String str = "abcdbdbbbbbb";
        int result = maxlengthSubstring(str);
        System.out.println(result);
    }
}
