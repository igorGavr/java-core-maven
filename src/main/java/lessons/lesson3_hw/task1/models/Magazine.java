package lessons.lesson3_hw.task1.models;

import lessons.lesson3_hw.task1.interfaces.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.name);
    }
}
