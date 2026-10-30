package in.stream.com;

import java.util.HashSet;
import java.util.Set;

public class NewLongestSubstring {
    static int getLongestSubstring(String str){

        if(str== null ||  str.isEmpty()){
             return 0;
        }

        int left = 0;
        int maxLength= 0;

        Set<Character> set = new HashSet<>();
        for(int right= 0; right<str.length(); right++){

            Character currectChar = str.charAt(right);

            while (set.contains(currectChar)){

                set.remove(str.charAt(left));
                left++;
            }
            set.add(currectChar);
            int currentWindow = right-left+1;
            if(currentWindow>maxLength){
                maxLength= currentWindow;
            }
        }

        return maxLength;
    }



public static void main(String[] args) {
        String str = "abcdderdddddddbbbbbbb";

    int longestSubstring = getLongestSubstring(str);
    System.out.println(longestSubstring);


}
}
