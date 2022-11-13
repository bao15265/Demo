package demo7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReduceStream {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("dog", "cat", "dog", "bird", "rabbit", "dog", "shark", "cat");

        //reduce, joining, groupBy
        Optional<String> reduceStr = animals.stream().reduce((a, b) -> a.concat(b.toUpperCase()));
        System.out.println(reduceStr);
        String joinStr = animals.stream().collect(Collectors.joining());
        System.out.println(joinStr);

        Map<String, Long> result = animals.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        Map<Boolean, List<String>> isEven = animals.stream().collect(
                Collectors.partitioningBy(i -> i.length() % 2 == 0));
        System.out.println(isEven);


        //summaryStatistics
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 10);

        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}
