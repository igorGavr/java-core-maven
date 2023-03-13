package lessons.lesson3_hw.task3.enums;
//1. Створити енум, який містить розміри одягу
// (XXS, XS, S, M, L). Написати в ньому  метод getDescription.
//   Додати в енум в поле int euroSize, написати
//   конструктор, який параметром буде приймати
//   значення для поля.

public enum Size {
    S(34){
        @Override
        public void getDescription() {
            System.out.println(Size.S + " is " + this.euroSize + "euroSize");
        }
    },
    M(36){
        @Override
        public void getDescription() {
            System.out.println(Size.M + " is " + this.euroSize + "euroSize");
        }
    },
    L(38){
        @Override
        public void getDescription() {
            System.out.println(Size.L + " is " + this.euroSize + "euroSize");
        }
    },
    XS(40){
        @Override
        public void getDescription() {
            System.out.println(Size.XS + " is " + this.euroSize + "euroSize");
        }
    },
    XSS(44){
        @Override
        public void getDescription() {
            System.out.println(Size.XSS + " is " + this.euroSize + "euroSize");
        }
    };

    public final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public abstract void getDescription();
}
