package lessons.lesson2.generic;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User<String> stringUser = new User<>("ads", "vas");

        User<Integer> integerUser = new User<Integer>(1, "dan");

        ArrayList<User> users = new ArrayList<>();

        users.add(stringUser);
        users.add(integerUser);
        System.out.println(users);

//        for (User user : users) {
//            if (user.getId() instanceof String) {
//                //....
//            } else if (user.getId() instanceof Integer) {
//                //...
//            }
//
//        }

    }
}
