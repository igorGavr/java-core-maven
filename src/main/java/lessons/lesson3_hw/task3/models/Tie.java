package lessons.lesson3_hw.task3.models;

import lessons.lesson3_hw.task3.enums.Size;
import lessons.lesson3_hw.task3.interfaces.Man;

public class Tie extends Clothes implements Man {
    public Tie(Size size, int prise, String colour) {
        super(size, prise, colour);
    }

    @Override
    public void DressMan() {
        System.out.println("Dress man in " + this.getClass().getSimpleName());

    }
}
