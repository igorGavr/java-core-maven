package lessons.lesson4.colections_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1, 2);
        integers.set(2, 12);
        integers.add(3);
        System.out.println(integers);
        Integer integer = integers.get(1);
//        integers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
        integers.sort((o1, o2) -> o1 - o2);
        integers.sort(Comparator.comparingInt(o -> o));

//        integers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//
//            }
//        });
        integers.forEach(integer1 -> {
            System.out.println(integer1 += 1);
        });

//        integers.removeIf(next -> next % 2 == 0);

        // iteration
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            int next =  iterator.next();
            if (next % 2 != 0)
                iterator.remove();
        }
        System.out.println(integers);

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(2);

        integers.addAll(integers2);
        System.out.println(integers);

        ArrayList<Integer> integers3 = new ArrayList<>();
        integers3.add(1);
        integers3.add(2);
        integers.removeAll(integers3);
        System.out.println(integers);

        integers2.removeIf(s -> s.equals(2));
        System.out.println(integers2);


    }
}
