package lessons.lesson3_hw.task3.models;

import lessons.lesson3_hw.task3.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Clothes {
    private Size size;
    private int prise;
    private String colour;
}
