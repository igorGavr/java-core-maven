package lessons.lesson3.interfaces.default_static_methods;

public class Main {
    public static void main(String[] args) {

        System.out.println(Some.x);

        Foo foo = new Foo();
        foo.doSome(23);
        foo.doSome2(23);
        foo.doSome3();

        foo.asd();
//        foo.qwe();  // error
        Some.qwe();
    }
}
