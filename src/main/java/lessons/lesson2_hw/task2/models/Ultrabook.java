package lessons.lesson2_hw.task2.models;

import lessons.lesson2_hw.task2.enums.CpuEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor

public class Ultrabook extends Laptop{
    private double displayThickness;

    public Ultrabook(CpuEnum cpu, int price, int ram, double display, double displayThickness) {
        super(cpu, price, ram, display);
        this.displayThickness = displayThickness;
    }
}
