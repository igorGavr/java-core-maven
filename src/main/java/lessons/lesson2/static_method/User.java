package lessons.lesson2.static_method;

public class User {
    public static int counter = 0;
    public static final int AGE = 100;

    public User() {
        counter += 1;
    }
}
