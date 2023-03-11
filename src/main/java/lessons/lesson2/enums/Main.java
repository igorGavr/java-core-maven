package lessons.lesson2.enums;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        User user = new User(1, "kokos", Gender.Male);

        Helper helper = new Helper();
        String extractToken = helper.extractToken(user);
        System.out.println(extractToken);

        Gender[] values = Gender.values();
        List<Gender> genders = Arrays.asList(values);
        System.out.println(genders);
        System.out.println(values);
        System.out.println(Arrays.toString(values));

        Gender male = Gender.valueOf("Male");
        System.out.println(male);
        System.out.println(male.ordinal());
    }
}
