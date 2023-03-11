package lessons.lesson2.exten;


class Policeman extends Human{

    private boolean status;

    public Policeman(String name, int age, boolean status) {
        super(name, age);
        this.status = status;
    }

}
