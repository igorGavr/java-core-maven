package lessons.lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    String name;
    int age;
    boolean status;
    double weight = 43.3;
    String[] skills;
    ArrayList<String> userSkills;
}
