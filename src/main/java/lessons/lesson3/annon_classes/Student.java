package lessons.lesson3.annon_classes;

import lessons.lesson3.interfaces.interface_implement.Father;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Singer {
    private String name;


    @Override
    public void sing() {
        System.out.println("ChatGPT поміг)");
    }
}
