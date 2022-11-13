package demo7;

import java.util.*;
import java.util.stream.Collectors;

public class OperationStream {
    public static void main(String[] args) {
        List<String> cards = Arrays.asList("10", null, "J", "Q", null, "K", "A", "+", "2");

        //filter, map, forEach
        cards.stream().filter(s -> s != null).map(String::toLowerCase).forEach(s -> System.out.print(s + " "));

        //peek, collect, limit, skip
        System.out.println();
        List<String> heads = cards.stream().filter(s -> s != null).skip(1).limit(4).peek(System.out::println)
                .peek(s -> System.out.print(s + " ")).toList();

        //findFirst, findAny
        System.out.println(heads.stream().findFirst());

//        //flatMap change data structures Stream<List<String> to Stream<String>
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).toList();
        namesNested.forEach(System.out::println);
        namesFlatStream.forEach(System.out::println);
    }
}
