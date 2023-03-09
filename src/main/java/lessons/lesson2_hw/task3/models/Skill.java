package lessons.lesson2_hw.task3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Skill {
    private String title;
    private int exp;
}
