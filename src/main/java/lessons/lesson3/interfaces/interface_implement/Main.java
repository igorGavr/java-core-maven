package lessons.lesson3.interfaces.interface_implement;

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


    }
}
