package lessons.lesson4_hw.task2;


import lombok.*;

import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;


    @Override
    public int compareTo(User o) {
        return -o.getSkills().size();
    }
}
