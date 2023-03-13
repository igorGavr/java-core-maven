package lessons.lesson2_hw.task5.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PC {
    private String model;
    private CPU cpu;
    private HardDrive hard;
}
