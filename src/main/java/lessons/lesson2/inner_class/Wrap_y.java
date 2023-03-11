package lessons.lesson2.inner_class;

public class Wrap_y {
    static int y;

    public Wrap_y(int y) {
        this.y = y;
    }


    static class Add {

        public void addTwo() {
            y +=2;
        }
    }
}
