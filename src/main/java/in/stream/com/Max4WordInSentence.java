package in.stream.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max4WordInSentence {

    static List<String> max4WordInSentence(String str ){

        return Arrays.stream(str.split("\\s+"))
                .distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String sentence = "Java streams are incredibly powerful and beautiful for text processing";
        System.out.println(max4WordInSentence(sentence));

    }
}
