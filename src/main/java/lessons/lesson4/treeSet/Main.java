package lessons.lesson4.treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1, "nas"));
        users.add(new User(2, "kss"));
        users.add(new User(3, "nres"));
        users.add(new User(3, "nds"));
        System.out.println(users);

    }
}
