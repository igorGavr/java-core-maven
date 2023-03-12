package lessons.lesson3.function_BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, String> integerStringFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        };

        String apply = integerStringFunction.apply(12);

        BiFunction<User, Customer, Admin> biFunction = (user, customer) -> new Admin(user.getName(), customer.getLogin(), customer.getPassword());

        Admin admin = biFunction.apply(new User("vas"), new Customer("asd", "32123"));
        System.out.println(admin);
//        BiFunction<User, Customer, Admin> biFunction = new BiFunction<User, Customer, Admin>() {
//            @Override
//            public Admin apply(User user, Customer customer) {
//                return new Admin(user.getName(), customer.getLogin(), customer.getPassword());
//            }
//        };
    }
}
