package lessons.lesson4_hw.task4.models;

import java.util.*;

public class School {
    private final Map<Teacher, List<Student>> school;
    private final Scanner in;

    public School() {
        this.school = new HashMap<>();
        this.in = new Scanner(System.in);
    }

    private Integer getIntFromInput() {
        try {
            return this.in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error!!!!!!!!!!!!");
            return null;
        }
    }

    private void addTeacher() {
        System.out.print("Input name of teacher: ");
        String name = this.in.next();
        final Teacher teacher = new Teacher(name);
        this.school.put(teacher, new ArrayList<>());
        System.out.println(teacher + " was added");
    }

    private List<Teacher> showTeachers() {
        final List<Teacher> teachers = this.school.keySet().stream().toList();
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i + ") " + teachers.get(i));
        }
        return teachers;
    }

    private void addStudentToTeacher(){
        final List<Teacher> teachers = this.showTeachers();
        if (teachers.size()>0) {
            System.out.println("Whom add a student?");
            final Integer choice = this.getIntFromInput();
            if (choice == null) {
                return;
            }
            System.out.print("Input name of Student: ");
            final String name = this.in.next();
            System.out.print("Input rating of Student: ");
            final String rating = this.in.next();

            this.school.get(teachers.get(choice)).add(new Student(name, rating));
            System.out.println("Student was added");
        } else {
            System.out.println("School is empty");
        }
    }

    private void deleteStudent() {
        final List<Teacher> teachers = this.showTeachers();
        System.out.print("Choose group: ");
        Integer choice = this.getIntFromInput();
        if (choice == null) {
            return;
        }
        final Teacher teacher = teachers.get(choice);
        final List<Student> students = this.school.get(teacher);

        if (students.size()>0) {
            for (int i = 0; i < students.size(); i++) {
                System.out.println(i + ") " + students.get(i));
            }
            System.out.print("Which student do you want to delete: ");
            choice = this.getIntFromInput();
            if (choice == null) {
                return;
            }
            students.remove((int) choice);
        }
    }

    private void deleteTeacher() {
        final List<Teacher> teachers = this.showTeachers();
        if (teachers.size()>0) {
            Integer choice = this.getIntFromInput();
            if (choice == null) {
                return;
            }
            this.school.remove(teachers.get(choice));
        }
    }

    private void deleteStudentFromSchool() {
        System.out.print("Input student name: ");
        String name = this.in.next();
        System.out.print("Input student rating: ");
        String rating = this.in.next();
        final Student student = new Student(name, rating);
        this.school.values().forEach(teacher -> teacher.removeIf(student1 -> student1.equals(student)));
    }

    private void showSchool() {
        this.school.entrySet().forEach(System.out::println);
    }


    public void menu() {
        while (true) {
            System.out.println("1) add teacher to school");
            System.out.println("2) add student to teacher.");
            System.out.println("3) delete student from teacher group.");
            System.out.println("4) delete teacher.");
            System.out.println("5) delete student from school.");
            System.out.println("6) show school.");
            System.out.println("9) exit.");

            System.out.println();

            System.out.print("Make your choice: ");
            String choice = this.in.next();

            switch (choice) {
                case "1" -> this.addTeacher();
                case "2" -> this.addStudentToTeacher();
                case "3" -> this.deleteStudent();
                case "4" -> this.deleteTeacher();
                case "5" -> this.deleteStudentFromSchool();
                case "6" -> this.showSchool();
                case "9" -> {
                    return;
                }
            }
        }
    }
}
