package lessons.lesson4.colections_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arraylist is - " + (end - start) + "ms!");

        long start2 = System.currentTimeMillis();
//        for (int i = 0; i < linkedList.size(); i++) {
//            linkedList.get(i);
//        }

//        Iterator<Object> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//        }

        for (Object o : linkedList) {

        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken for arraylist is - " + (end2 - start2) + "ms!");
    }
}
