package lessons.lesson2.builder;

public class Main {
    public static void main(String[] args) {

        User kokos = User.builder().id(1).name("kokos").build();
        System.out.println(kokos);
    }
}
