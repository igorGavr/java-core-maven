package lessons.lesson2.inner_class;

public class Wrap {
    private int x;

    public Wrap(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    class AddOperations {
        public void addOne() {
            x+=1;
        }
    }


}


