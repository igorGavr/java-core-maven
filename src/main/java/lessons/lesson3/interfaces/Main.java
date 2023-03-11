package lessons.lesson3.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("okten");

        System.out.println(X.ID);
        System.out.println(X.foo());
        ArrayList<X> xList = new ArrayList<>();
        xList.add(new User());
        xList.add(new Student());
        for (X x : xList) {
            x.greeting();
            x.bar();

        }


        ArrayList<Y> yList = new ArrayList<Y>();
        yList.add(new User());
        yList.add(new Policeman());
        for (Y y : yList) {
            y.scream("23");

        }
//        анонімний клас
        X x1 = new X() {
            @Override
            public void greeting() {
                System.out.println("x1");
            }
        };
        System.out.println(x1);

        Y y1 = (String st) -> {
            System.out.println(st + "!!!");
        };
        y1.scream("as");  // as!!!

        barfoo(y1);
        barfoo(whatToScream -> System.out.println("sdfa"));


    }

    public static void barfoo(Y y) {
        //sdfaf
    };
}

interface X {
//    public static final
    int ID = 12;
    void greeting();

    static String foo(){
        return "foo";
    }
    default void bar(){
        System.out.println("bar");
    }
}

interface Y {
    void scream(String whatToScream);
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements X, Y {
    private int id;
    private String name;

    @Override
    public void greeting() {
        System.out.println("user greetings");
    };

    @Override
    public void scream(String whatToScream) {
        System.out.println("User scream");
    }
    //    @Override
//    public void bar() {
//        X.super.bar();
//    }
}

class Student implements X {
    @Override
    public void greeting() {
        System.out.println("Student greeting");
    };

//    @Override
//    public void bar() {
//        X.super.bar();
//    }
}

class Policeman implements Y {
    @Override
    public void scream(String whatToScream) {
        System.out.println("musor scream");
    }
}
