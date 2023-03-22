package lessons.lesson1;

public class StaticVar {
    static int a = 10;
    int b = 23;

    public static void main(String[] args) {
        int x = 3;
        System.out.println(x);
        System.out.println(a);
        // не статичні зміні видні лише в не статичних класах
//        System.out.println(b);  // error


    }
    public void checkB() {
        System.out.println(b);
    }

    public static void print() {
//        System.out.println(b); // error
        System.out.println(a);
//        System.out.println(x); // error
    }
}
