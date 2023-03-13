package lessons.lesson2_hw.task5.models;

import lessons.lesson2_hw.task5.enums.HddSsd;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HardDrive {
    private String producer;
    private int volume;
    private HddSsd hddSsd;
}
