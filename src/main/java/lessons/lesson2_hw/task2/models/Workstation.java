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
public class Workstation extends Laptop{
    private int power;

    public Workstation(CpuEnum cpu, int price, int ram, double display, int power) {
        super(cpu, price, ram, display);
        this.power = power;
    }
}
