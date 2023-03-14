package lessons.lesson4.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Friend> map = new HashMap<>();
        map.put("doctor", new Friend("Stoc", 23));
        map.put("doctor2", new Friend("Sdf", 93));
        map.put("doctor3", new Friend("Sas", 24));
        map.put("doctor4", new Friend("asdftoc", 43));

        System.out.println(map);

        Friend df = map.get("df");
        System.out.println(df);  // null

        map.containsKey("dfa");
        map.remove("dfa");
        map.replace("sdf", new Friend("ad", 23));
        Set<String> strings = map.keySet();
        System.out.println(strings);

        Collection<Friend> values = map.values();
        System.out.println(values);
        System.out.println("8989898------------90909090");

        Set<Map.Entry<String, Friend>> entrySet = map.entrySet();
        System.out.println(entrySet);
        List<Map.Entry<String, Friend>> collect = entrySet.stream().collect(Collectors.toList());
        System.out.println(collect);

        ArrayList<Map.Entry<String, Friend>> entryArrayList = new ArrayList<>(entrySet);

        Iterator<Map.Entry<String, Friend>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Friend> next = iterator.next();
            System.out.println(next);
            Friend value = next.getValue();
            if (value.getAge()%2==0) {
                iterator.remove();
            }
        }

        System.out.println(map);


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("urik", 23));
        users.add(new User("ziat", 25));
        users.add(new User("ya", 25));

        users.stream()
                .distinct()
                .map(user -> new CutedUser(user.getName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
