package lessons.lesson2.arrays;

public class Main {
    public static void main(String[] args) {

//        String[] skills = {"asd", "asds"};
//        User user = new User(1, "vas", skills);
//        System.out.println(user);

        User user = new User(1, "kokos");
        user.addSkill(0, "java");
        user.addSkill(1, "python");
        System.out.println(user);


    }
}
