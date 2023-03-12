package lessons.lesson2.exten.var_2;

public class Archer extends Forest{
    public Archer(int damage, int defence, Type type) {
        super(damage, defence, type);
    }

    @Override
    public void castSpell() {
        // 2
    }
}
