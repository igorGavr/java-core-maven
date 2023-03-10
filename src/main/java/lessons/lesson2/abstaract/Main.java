package lessons.lesson2.abstaract;

import lombok.Data;
import lombok.ToString;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void scream() {
                System.out.println("as");
            }
        };
        animal.scream(); // as
        Horse horse = new Horse(122, true, "sivs");
    }
}

@Data
abstract class Animal {
    private int legs;
    private boolean brain;

    public Animal() {
    }

    public Animal(int legs, boolean brain) {
        this.legs = legs;
        this.brain = brain;
    }

    public abstract void scream();
}

@Data
@ToString(callSuper = true)
class Horse extends Animal {
    private String breed;

    public Horse() {
    }

    public Horse(int legs, boolean brain, String breed) {
        super(legs, brain);
        this.breed = breed;
    }

    @Override
    public void scream() {

    }
}
