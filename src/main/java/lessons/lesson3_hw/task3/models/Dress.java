package lessons.lesson3_hw.task3.models;

import lessons.lesson3_hw.task3.enums.Size;
import lessons.lesson3_hw.task3.interfaces.Woman;

public class Dress extends Clothes implements Woman {
    public Dress(Size size, int prise, String colour) {
        super(size, prise, colour);
    }

    @Override
    public void DressWoman() {
        System.out.println("Dress woman in " + this.getClass().getSimpleName());

    }
}
