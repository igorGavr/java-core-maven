package lessons.lesson2.chain;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        User vas = user.setId(12).setName("vas");
        System.out.println(vas);
    }
}
