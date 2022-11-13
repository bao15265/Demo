package demo7;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //primitive
        IntStream.range(1, 10).forEach(x -> System.out.print(x + " "));
        System.out.printf("%n%d%n", DoubleStream.of(1.430, 2.4435, 3.7).count());
        LongStream.range(1, 12).filter(x -> x % 2 != 0).forEach(x -> System.out.print(x + " "));

        //arrays
        String[] lang = {"Java", "C#", "C++", "PHP", "Javascript"};

        System.out.printf("%n%d%n", Arrays.stream(lang).count());
        Stream.of(lang).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //collections
        List<Integer> numbers = List.of(13, 52, 74, 27, 59, 6, 64, 1);

        Set<Integer> num = new TreeSet<>(numbers);
        System.out.println(num);
        num.stream().sorted((x1, x2) -> x2 - x1).forEach(x -> System.out.print(x + " "));
        System.out.println(num);

        //using Stream.builder
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> live = builder.add("J").add("Q").add("K").add("A").add("2").build();
        live.forEach(System.out::println);
    }
}
