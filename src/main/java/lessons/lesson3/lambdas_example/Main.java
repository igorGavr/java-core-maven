package lessons.lesson3.lambdas_example;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(112);
        integers.add(2);
        integers.sort(Comparator.comparingInt(o -> o));

//        integers.sort((o1, o2) -> o1-o2);

//        integers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
    }
}
