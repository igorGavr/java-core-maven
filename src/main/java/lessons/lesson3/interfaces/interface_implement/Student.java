package lessons.lesson3.interfaces.interface_implement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Father implements Singer{
    private String name;


    @Override
    public void sing() {
        System.out.println("ChatGPT поміг)");
    }
}
