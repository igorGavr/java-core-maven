package lessons.lesson2.exten.var_2;

public abstract class Dungeon extends Unit{
    public String bonus = "hit forest unit twice";

    public Dungeon(int damage, int defence, Type type) {
        super(damage, defence, type);
    }
}
