package lessons.lesson2.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        User[] users = new User[2];
//        users[0] = new User(1, "vaj");
//        users[1] = new User(1, "sd");
//        System.out.println(users);
//        System.out.println(Arrays.toString(users));

//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1, "vaj"));
//        users.add(new User(1, "sd"));
//        System.out.println(users);
//        System.out.println(users.get(1));
//        System.out.println(users.size());

        User vas = new User(1, "vas");
        ArrayList<String> skills = vas.getSkills();
        skills.add("java");
        System.out.println(vas);

    }
}
