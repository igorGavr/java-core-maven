package lessons.lesson5.exceptions;

public class Main {
    public static void main(String[] args) {

//        try {
////            System.out.println(10 / 0); // AE
////            int[] ints = {1, 2};
////            System.out.println(ints[100]); // AIOBE
//
//            Object o = 100;
//            String s = (String) o;
//            s.toLowerCase();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//            //.....
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            //...
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            //....
//        } finally {
//            //....
//
//        }
//
//        System.out.println("-----");

        try {
            foobar(10, 0);
        } catch (RuntimeException e) {
            //....
        }

    }

    public static double foobar(int a, int b) throws RuntimeException {
        if (b == 0) {
            throw new RuntimeException("your b arg is 0");
        }

        return a / b;

    }

}

class CustomException extends Exception {


}
