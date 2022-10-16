package demo4;

import java.util.*;
public class Iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(22);
        list.add(19);
        list.add(99);

        Iterator here = list.iterator();
        here.next();
        here.hasNext();
        here.remove();

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        Iterator<String> hereStr = strings.iterator();
        String here1 = hereStr.next();

    }
}
