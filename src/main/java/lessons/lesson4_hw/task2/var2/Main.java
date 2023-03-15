package lessons.lesson4_hw.task2.var2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "kutasic",
                "mokriy", "dfadf", 22,
                Gender.MALE, Arrays.asList(
                new Skill("javca", 12)
        ), new Car("dsaf", 2323, 3));
        User user2 = new User(2, "kutasic",
                "mokriy", "dfadf", 22,
                Gender.MALE, Arrays.asList(
                new Skill("javca", 12),
                new Skill("javca", 12),
                new Skill("javca", 12)
        ), new Car("dsaf", 2323, 2));
        User user3 = new User(3, "kutasic",
                "mokriy", "dfadf", 22,
                Gender.FEMALE, Arrays.asList(
                new Skill("javca", 12),
                new Skill("javca", 12),
                new Skill("javca", 12),
                new Skill("javca", 12)
        ), new Car("dsaf", 2323, 1));

        final List<User> userslist = Arrays.asList(user1, user2, user3);
        HashSet<User> users = new HashSet<>(userslist);
//        users.removeIf(new Predicate<User>() {
//            @Override
//            public boolean test(User user) {
//                return user.getGender()==Gender.MALE;
//            }
//        });
//        final Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getGender()==Gender.FEMALE) {
//                iterator.remove();
//            }
//        }
//        System.out.println(users);
        final TreeSet<User> userTreeSet = new TreeSet<>(userslist);
        System.out.println(userTreeSet);
    }
}
