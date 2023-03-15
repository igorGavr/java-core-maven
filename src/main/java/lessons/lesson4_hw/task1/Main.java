package lessons.lesson4_hw.task1;

import java.security.PrivilegedAction;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("adfa", 13));
        users.add(new User("sdadfa", 33));
        users.add(new User("dgadfa", 43));
        users.add(new User("asdadfa", 23));

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(users);


        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println(users);

        String arr[] = {"banana", "cherry", "apple"};
        System.out.println("Original : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted   : " + Arrays.toString(arr));


        ArrayList<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("c");
        strings.add("a");
//        Collections.sort(strings);
        strings.sort(String::compareTo);
        System.out.println(strings);


    }
}
