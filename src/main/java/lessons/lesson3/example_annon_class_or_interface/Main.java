package lessons.lesson3.example_annon_class_or_interface;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-2);
        integers.add(2);
        integers.add(23);
        integers.add(-23);
        System.out.println(integers);

//        ComparatorImpl comparator = new ComparatorImpl();
//        integers.sort(comparator);
//        System.out.println(integers);

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);
    }
}
