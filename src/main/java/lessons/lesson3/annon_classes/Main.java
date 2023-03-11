package lessons.lesson3.annon_classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Student("asdf"));
        singers.add(new User());
        System.out.println(singers);

        Singer singer = singers.get(1);
        singer.sing();
//        singer.greeting();  // error - через обрізування методів

        Singer singer1 = new Singer() {
            @Override
            public void sing() {
                System.out.println("sing 1");
            }
        };

        Singer singer2 = new Singer() {
            @Override
            public void sing() {
                System.out.println("sing 2");
            }
        };
        singer1.sing();
        singer2.sing();

    }
}
