package lesson2.task2.models;

import lesson2.task2.enums.CpuEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor

public class Laptop extends PC{
    private double display;
    public Laptop(CpuEnum cpu, int price, int ram, double display) {
        super(cpu, price, ram);
        this.display = display;

    }
}
