package demo4;

import java.util.*;
public class Iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(22);
        list.add(19); // 15 22 19 99
        list.add(99);

        Iterator<Integer> here = list.iterator();

//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("one");
//        strings.add("two");
//        strings.add("three");
//        strings.add("four");
//
//        Iterator<String> hereStr = strings.iterator();
//        String here1 = hereStr.next();
//
        Queue<String> queue = new LinkedList<String>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        Iterator hereQueue = queue.iterator();
        // if queue has change after use iterator(), it will throw 1 ConcurrentModificationException
        queue.offer("five");
        while (hereQueue.hasNext()){
            System.out.println(hereQueue.next());
        }
        System.out.println(queue);
    }
}
