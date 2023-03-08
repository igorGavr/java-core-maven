package lesson2.task3;

import lesson2.task3.enums.Gender;
import lesson2.task3.models.Skill;
import lesson2.task3.models.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "bobi", "mam", "mam@gmail",
                23, Gender.MALE, new ArrayList<>(),
                "Kia",
                2008,
                600);
        ArrayList<Skill> skills = user.getSkills();

        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 5));
        skills.add(new Skill("python", 10));

        System.out.println(user);
    }
}
