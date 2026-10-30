package in.stream.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max4WordSentence {
    public static void main(String[] args) {

        String str = "ram is going to sgchool and marger when it comes back to fountain";

        List<String> list = Arrays.stream(str.split("\\s+")).distinct()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(2)
                .toList();

        System.out.println(list);
    }
}
