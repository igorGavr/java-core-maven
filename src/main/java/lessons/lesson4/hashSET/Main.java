package lessons.lesson4.hashSET;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

//        HashSet<String> users = new HashSet<>();
//        users.add("nas");
//        users.add("kss");
//        users.add("nres");
//        users.add("nds");
//        System.out.println(users);

        HashSet<User> users = new HashSet<>();
        users.add(new User(1, "nas"));
        users.add(new User(2, "kss"));
        users.add(new User(3, "nres"));
        users.add(new User(3, "nds"));
        users.add(new User(3, "nds"));
        System.out.println(users);

    }
}
