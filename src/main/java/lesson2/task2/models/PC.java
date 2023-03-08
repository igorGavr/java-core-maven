package lesson2.task2.models;

import lesson2.task2.enums.CpuEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private CpuEnum cpu;
    private int price;
    private int ram;
}
