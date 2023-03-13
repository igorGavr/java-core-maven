package lessons.lesson2_hw.task5.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CPU {
    private String model;
    private int frequency;
    private int generation;
    private String producer;
}
