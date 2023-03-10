package lessons.lesson3_hw.task2.models;

import lessons.lesson3_hw.task2.interfaces.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private int string_quantity;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() +" - " +  this.string_quantity);
    }
}
