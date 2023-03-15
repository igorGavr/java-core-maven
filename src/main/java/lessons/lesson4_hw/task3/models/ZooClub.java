package lessons.lesson4_hw.task3.models;

import java.util.*;

public class ZooClub {
    private final Map<Person, List<Pet>> zooClub;
    private final Scanner in;

    public ZooClub() {
        this.zooClub = new HashMap<>();
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

    private void addPerson() {
        System.out.print("Введіть ім'я: ");
        String name = this.in.next();
        Person person = new Person(name);
        this.zooClub.put(person, new ArrayList<>());
        System.out.println(person + " був доданий");
    }

    private List<Person> showPersons() {
        List<Person> people = this.zooClub.keySet().stream().toList();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(i + ") " + people.get(i));
        }
        return people;
    }

    private void addPetToPerson() {
        List<Person> people = this.showPersons();

        if (people.size() > 0) {
            System.out.print("Кому додаємо тваринку: ");
            Integer choice = this.getIntFromInput();

            if (choice == null) {
                return;
            }

            System.out.print("Введіть ім'я тваринки: ");
            String name = this.in.next();
            System.out.print("Введіть тип тваринки: ");
            String type = this.in.next();

            this.zooClub.get(people.get(choice)).add(new Pet(name, type));
            System.out.println("Тваринка додана");
        } else {
            System.out.println("Немає учасників клубу");
        }
    }

    private void deletePet() {
        List<Person> people = this.showPersons();
        System.out.print("З якого власника видалити тваринку?: ");
        Integer choice = this.getIntFromInput();

        if (choice == null) {
            return;
        }

        List<Pet> pets = this.zooClub.get(people.get(choice));

        if (pets.size() > 0) {
            for (int i = 0; i < pets.size(); i++) {
                System.out.println(i + ") " + pets.get(i));
            }

            System.out.print("Яку тваринку видалити?: ");
            choice = this.getIntFromInput();

            if (choice == null) {
                return;
            }
            pets.remove((int) choice);
        }
    }

    private void delPerson() {
        List<Person> people = this.showPersons();
        if (people.size() > 0) {
            Integer choice = this.getIntFromInput();

            if (choice == null) {
                return;
            }

            this.zooClub.remove(people.get(choice));

        }
    }

    private void delPetsFromClub() {
        System.out.print("Введіть ім'я тваринки: ");
        String name = this.in.next();
        System.out.print("Введіть тип тваринки: ");
        String type = this.in.next();
        Pet tmp = new Pet(name, type);
        this.zooClub.values().forEach(item -> item.removeIf(pet -> pet.equals(tmp)));
    }

    private void showZooClub() {
//        this.zooClub.entrySet().forEach(item -> System.out.println(item));
        this.zooClub.entrySet().forEach(System.out::println);
    }

    public void menu() {
        while (true) {
            System.out.println("1) додати учасника в клуб");
            System.out.println("2) додати тваринку до учасника клубу.");
            System.out.println("3) видалити тваринку з власника.");
            System.out.println("4) видалити учасника клубу.");
            System.out.println("5) видалити конкретну тваринку з усіх власників.");
            System.out.println("6) вивести на екран зооклуб.");
            System.out.println("9) Вихід.");

            System.out.println();

            System.out.print("Зробіть свій вибір: ");
            String choice = this.in.next();

//            switch (choice) {
//                case "1":
//                    this.addPerson();
//                    break;
//                case "2":
//                    this.addPetToPerson();
//                    break;
//
//                case "3":
//                    this.deletePet();
//                    break;
//                case "4":
//                    this.delPerson();
//                    break;
//                case "5":
//                    this.delPetsFromClub();
//                    break;
//                case "6":
//                    this.showZooClub();
//                    break;
//                case "9":
//                    return;
//            }
            switch (choice) {
                case "1" -> this.addPerson();
                case "2" -> this.addPetToPerson();
                case "3" -> this.deletePet();
                case "4" -> this.delPerson();
                case "5" -> this.delPetsFromClub();
                case "6" -> this.showZooClub();
                case "9" -> {
                    return;
                }
            }
        }
    }
}
