package lessons.lesson2.static_method;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.counter = 1;
        // статична змінна єдина для всіх екземплярів класів
        System.out.println(user.counter);  // 1
        System.out.println(User.counter);  // 1

        User user1 = new User();
        System.out.println(User.counter); // 2

        System.out.println(User.AGE);  // 100
    }
}
