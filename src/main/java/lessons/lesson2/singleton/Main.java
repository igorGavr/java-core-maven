package lessons.lesson2.singleton;

public class Main {
    public static void main(String[] args) {

        User vas = User.getInstance("vas");
        User pet = User.getInstance("pet");
        System.out.println(pet);  // vas
    }
}
