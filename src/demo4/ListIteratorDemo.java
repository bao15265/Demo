package demo4;

import java.util.*;
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(15); // 15 22 19 99
        list.add(22);
        list.add(19);
        list.add(99);

        ListIterator here = list.listIterator();
        here.next();
        here.next();
        here.add(27);
        here.previous();
        here.set(18);
        here.hasPrevious();
    }
}
