package lessons.lesson2.generic;


public class Main {
    public static void main(String[] args) {
        User<String> stringUser = new User<>();

        User<Integer> integerUser = new User<Integer>();

//        ArrayList<User> users = new ArrayList<>();

//        users.add(stringUser);
//        users.add(integerUser);

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
