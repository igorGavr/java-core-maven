package lessons.lesson4_hw.task2.var2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Comparable<User>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;


    @Override
    public int compareTo(User o) {
        int i = this.car.getPower() - o.getCar().getPower();
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
