package demo7;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
   List<Integer> numbers = List.of(13,52,74,27,59,6,64,1);

    public void withoutStream() {
        List<Integer> evenNum = new ArrayList<Integer>();
        long count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNum.add(number);
                count++;
            }
        }
        System.out.println(evenNum);
        System.out.println(String.format("There are %d elements that are even", count));
    }

    public void withStream() {
//        Stream<Integer> live = numbers.stream().filter(num -> num % 2 == 0);
        List<Integer> evenNum = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        long count =  numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.println(evenNum);
        System.out.println(String.format("There are %d elements that are even", count));
    }

    public static void main(String[] args) {
        Demo test = new Demo();
        test.withoutStream();
        test.withStream();
    }
}
