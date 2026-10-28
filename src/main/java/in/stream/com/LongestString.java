package in.stream.com;

import java.util.HashSet;
import java.util.Set;

public class LongestString {
    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }
        int left = 0;
        int maxLength=0;

        Set<Character> set = new HashSet<>();

        for(int right=0; right<s.length(); right++){
            Character currentCharacter = s.charAt(right);

            while(set.contains(currentCharacter)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentCharacter);

            int currentWindows= right-left+1;
            if(currentWindows>maxLength){
                maxLength=currentWindows;
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String str ="addbcdddd";
        int length = lengthOfLongestSubstring(str);
        System.out.println(length);
    }
}
