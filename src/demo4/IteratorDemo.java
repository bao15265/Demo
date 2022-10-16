package demo4;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            linkedList.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            hashSet.add((int) (Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            treeSet.add((int) (Math.random() * 10));
        }

        Iterator hereArray = arrayList.iterator();
        Iterator hereLinked = linkedList.iterator();
        Iterator hereHash = hashSet.iterator();
        Iterator hereTree = treeSet.iterator();

        System.out.println("Array List");
        while (hereArray.hasNext()) {
            System.out.print(hereArray.next() + " ");
        }
//        for (Iterator i = arrayList.iterator(); i.hasNext();) {
//            System.out.print(i.next() + " ");
//        }
        System.out.println("\nLinked List");
        while (hereLinked.hasNext()) {
            System.out.print(hereLinked.next() + " ");
        }
        System.out.println("\nHash Set");
        while (hereHash.hasNext()) {
            System.out.print(hereHash.next() + " ");
        }
        System.out.println("\nTree Set");
        while (hereTree.hasNext()) {
            System.out.print(hereTree.next() + " ");
        }
    }
}