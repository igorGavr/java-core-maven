package lessons.lesson1;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(sum(1, 3.3));
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public  static double sum(double a, double b) {
        return a+b;
    }
}
