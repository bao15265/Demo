package demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStream {
    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long startTime1 = System.nanoTime();
        long count1 = values.stream().skip(1234).distinct().filter(s -> s.length() > 15).count();
        System.out.println(count1);
        long endTime1 = System.nanoTime();
        long millis1 = TimeUnit.NANOSECONDS.toMillis(endTime1 - startTime1);
        System.out.println(String.format("sequential sort took: %d ms", millis1));

        long startTime2 = System.nanoTime();
        long count2 = values.parallelStream().skip(1234).distinct().filter(s -> s.length() > 15).count();
        System.out.println(count2);
        long endTime2 = System.nanoTime();
        long millis2 = TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2);
        System.out.println(String.format("parallel sort took: %d ms", millis2));
    }
}
