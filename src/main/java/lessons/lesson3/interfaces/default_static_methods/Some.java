package lessons.lesson3.interfaces.default_static_methods;

public interface Some {
//    public static final
    int x = 0;
    // public
    int doSome(int x);
    int doSome2(int x);
    String doSome3();
    default void asd(){
        System.out.println(x);
    }
    static void qwe(){}
}
