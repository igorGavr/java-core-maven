package lessons.lesson2.exten;

import lessons.lesson2.exten.Human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student Vasya = new Student("sd", "vaslia", 23);
        System.out.println(Vasya);

        Policeman Musor = new Policeman("musor", 23, true);

        Human naz = new Human("naz", 23);
        Vasya.fooHuman();

        ArrayList<Human> users = new ArrayList<>();
        users.add(Vasya);
        users.add(Musor);
        users.add(naz);

        System.out.println(users);

//        Human student = users.get(0);
//        student.foo();  // error

        Student student = (Student) users.get(0);
        student.foo();    // works

    }
}

