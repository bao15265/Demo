package demo7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //using Stream.generate()
        String[] testStrArr = Stream.generate(() -> "abc").limit(3).toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr));

        //using Stream.iterable
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10).map(n -> n[0])
                .forEach(x -> System.out.print(x + " "));
        Stream.iterate(1, x -> x < 20, x -> x + 3).forEach(x -> System.out.print(x + " "));

        //takeWhile, dropWhile
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        num.stream().filter(x -> x <= 5).forEach(x -> System.out.print(x + " "));
        num.stream().takeWhile(x -> x <= 5).forEach(x -> System.out.print(x + " "));
        num.stream().dropWhile(x -> x <= 5).forEach(x -> System.out.print(x + " "));
    }
}
