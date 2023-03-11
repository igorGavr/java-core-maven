package lessons.lesson3.annon_classes;

import lombok.Data;

@Data
public class User implements Singer {
    private String name;

    @Override
    public void sing() {
        System.out.println("Я вже зробив уроки");
    }

    public String greeting() {
        return " hello ";
    }
}
