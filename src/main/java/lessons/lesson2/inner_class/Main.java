package lessons.lesson2.inner_class;

public class Main {
    public static void main(String[] args) {

        Wrap wrap = new Wrap(0);

        Wrap.AddOperations addOperations = wrap.new AddOperations();

        addOperations.addOne();
        addOperations.addOne();
        System.out.println(wrap.getX());


        Wrap_y.Add add = new Wrap_y.Add();

        add.addTwo();
        add.addTwo();
        System.out.println(Wrap_y.y);
    }
}

