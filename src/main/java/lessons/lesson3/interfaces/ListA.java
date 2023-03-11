package lessons.lesson3.interfaces;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListA {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        User mango = new User(6, "mango");
        users.add(mango);

        System.out.println(users);
        users.forEach(System.out::println);

        Function <User, String> userStringFunction = user -> user.getName();
        System.out.println(userStringFunction.apply(mango));   // "mango"

        List<User> filterList = users
                .stream()
                .filter((value) -> value.getId() > 3)
                .collect(Collectors.toList());
        System.out.println(filterList);

        List<String> mappedUsersToString = users.stream().map(user -> user.getName()).collect(Collectors.toList());
        System.out.println(mappedUsersToString);
    }
}
