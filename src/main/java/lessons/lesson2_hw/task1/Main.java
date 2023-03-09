package lessons.lesson2_hw.task1;

import lessons.lesson2_hw.task1.models.User;
import lessons.lesson2_hw.task1.models.Address;
import lessons.lesson2_hw.task1.models.Company;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Max",
                "Max1",
                "admin@gmail.com",
                new Address("street", "sdfsf", "lviv", "79000", "1212", "33333"),
                "555-5550",
                "www.com",
                new Company("owu", "sdfsdf", "sdfsdf")
        );

        System.out.println(user);
    }
}
