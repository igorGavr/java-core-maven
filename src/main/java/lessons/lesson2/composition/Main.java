package lessons.lesson2.composition;

public class Main {
    public static void main(String[] args) {
//        композиція
        Engine engine = new Engine(4, 300, "tr400");
        Tractor tractor = new Tractor("jonh_geer", engine);
        System.out.println(tractor);
//        агрегація
        Tractor tr2 = new Tractor("lamba", 3, 233, "l23");
        System.out.println(tr2);

    }
}
