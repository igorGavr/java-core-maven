package lessons.lesson2.arrays;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private String skills[] = new String[4];

    public void addSkill(int i, String skill){
        if (i >= 0 && i < skills.length) {
            skills[i] = skill;
        }
    }
}
