package in.stream.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {


    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> collect = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> {
                    char[] charArray = word.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }));

        List<List<String>> anagramGroups = new ArrayList<>(collect.values());
        System.out.println(anagramGroups);

    }
}
