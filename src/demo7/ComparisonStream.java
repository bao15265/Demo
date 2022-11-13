package demo7;

import java.util.*;
import java.util.stream.Collectors;

public class ComparisonStream {
    public static void main(String[] args) {
        //sorted, distinct, min, count, allMatch
        List<String> str = Arrays.asList("10321", "Jack", "Queen", "Queen", "King", "Jack", "Astra", ">L?+", "2light");

        List<String> newStr = str.stream().sorted((s1, s2) -> s1.length() - s2.length()).distinct().toList();
        newStr.forEach(s -> System.out.print(s + " "));
        long count = newStr.stream().count();
        System.out.println(count);
        Optional<String> min = newStr.stream().min(Comparator.comparingInt(String::length));
        System.out.println("\n" + min);
        boolean right = newStr.stream().allMatch(s -> s.length() == 4);
        System.out.println(right);
    }

}
