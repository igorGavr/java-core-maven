package lessons.lesson4.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("adsf1");
        list.add("adsdsdsdsf1");
        list.add("adssdsf2");
        list.add("adssdf3");
        list.add("adssdsdsd  f4");
        System.out.println(list);

//        List<Integer> stringStream = list.stream()
//                .distinct()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return s.length();
//                    }
//                })
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer%2==0;
//                    }
//                })
//                .sorted(new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o1-o2;
//                    }
//                })
//                .collect(Collectors.toList());

        List<Integer> collect = list.stream()
                .distinct()
                .map(String::length)
                .filter(integer -> integer%2==0)
                .sorted(Comparator.comparingInt(o -> o))
                .collect(Collectors.toList());
        System.out.println(collect);

        boolean b = collect.stream().allMatch(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        });
        System.out.println(b);

        Optional<Integer> max = collect.stream().max((o1, o2) -> o1 - o2);
        System.out.println(max);

    }
}
