package lessons.lesson2.exten.var_2;

public abstract class Forest extends Unit{
    public String buff = "def bonus 20%";

    public Forest(int damage, int defence, Type type) {
        super(damage, defence, type);
    }

    public abstract void castSpell();
}
