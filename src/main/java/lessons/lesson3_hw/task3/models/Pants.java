package lessons.lesson3_hw.task3.models;

import lessons.lesson3_hw.task3.enums.Size;
import lessons.lesson3_hw.task3.interfaces.Man;
import lessons.lesson3_hw.task3.interfaces.Woman;

public class Pants extends Clothes implements Man, Woman {
    public Pants(Size size, int prise, String colour) {
        super(size, prise, colour);
    }

    @Override
    public void DressMan() {
        System.out.println("Dress man in " + this.getClass().getSimpleName());
    }

    @Override
    public void DressWoman() {
        System.out.println("Dress woman in " + this.getClass().getSimpleName());
    }
}
