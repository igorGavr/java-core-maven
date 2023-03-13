package lessons.lesson4.colections_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Diferance {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();

        System.out.println("Time taken for arraylist to remove is - " + (end - start) + "ms!");

        long start2 = System.currentTimeMillis();
        linkedList.remove(0);
        long end2 = System.currentTimeMillis();

        System.out.println("Time taken for linkedlist to remove is - " + (end2 - start2) + "ms!");
    }
}
