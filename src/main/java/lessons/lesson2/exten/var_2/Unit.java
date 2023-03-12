package lessons.lesson2.exten.var_2;

public abstract class Unit {
    public int damage;
    public int defence;
    public Type type;

    public Unit(int damage, int defence, Type type) {
        this.damage = damage;
        this.defence = defence;
        this.type = type;
    }
}
