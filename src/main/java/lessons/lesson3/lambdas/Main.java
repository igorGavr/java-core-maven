package lessons.lesson3.lambdas;

public class Main {
    public static void main(String[] args) {

//        Calculator calculator = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return 0;
//            }
//        };

        Calculator calculator = (a, b) -> 0;
        Calculator calculator2 = (a, b) -> a + b;
        Calculator calculator3 = Integer::sum;

        foobar(12, 13, (a, b) -> a*b);
    }

    public static void foobar (int a, int b, Calculator calculator2) {
        calculator2.calculate(a, b);
    }
}
