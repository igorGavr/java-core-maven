package lessons.lesson2.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String[] skills = {"asd", "asds"};
//        User user = new User(1, "vas", skills);
//        System.out.println(user);

        User user = new User(1, "kokos");
        user.addSkill(0, "java");
        user.addSkill(1, "python");
        System.out.println(user);

        final List<User2> user2List = Arrays.asList(
                new User2("nsd", 23),
                new User2("nasssd", 24),
                new User2("nasd", 223)
                );
//        user2List.sort(Comparator.comparingInt(User2::getAge));
        user2List.sort(Comparator.comparingInt(o -> -o.getName().length()));
        System.out.println(user2List);
    }
}
