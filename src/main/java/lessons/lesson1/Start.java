package lessons.lesson1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        System.out.println("sdfsadf");

//        String[] skills = new String[3];
//        skills[0] = "java";
//        skills[1] = "java";
//        skills[2] = "java";

        String[] skills = {"java", "js", "html"};

        ArrayList<String> userSkills = new <String>ArrayList();
        userSkills.add("java");
        userSkills.add("python");
        userSkills.add("js");
        System.out.println(userSkills);
        User userInnstance = new User("kokos", 23, true, 23.3, skills, userSkills);
        System.out.println(userInnstance);
        System.out.println(userInnstance.getName());
    }

}
