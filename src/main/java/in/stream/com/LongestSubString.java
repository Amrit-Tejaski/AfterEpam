package in.stream.com;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
 static int longestString(String str){
     int left = 0;
     int maxLength= 0;
     Set<Character> set = new HashSet<>();


     for(int right= 0; right<str.length(); right++){
         Character  currentCharacter = str.charAt(right);

         while (set.contains(currentCharacter)){
             set.remove(str.charAt(left));
             left++;
         }
         set.add(currentCharacter);
         int currentWindow = right-left+1;
         if(currentWindow>maxLength){
             maxLength = currentWindow;
         }
     } return maxLength;
 }

    public static void main(String[] args) {
        String str ="addbcdddd";
        int length = longestString(str);
        System.out.println(length);
    }
}
