package lessons.lesson3_hw.task1.models;

import lessons.lesson3_hw.task1.interfaces.Printable;

import java.util.ArrayList;

public class Library {
    private static final ArrayList<Printable> library = new ArrayList<>();

    public static void add(Printable item){
        library.add(item);
    }

    public static void showBooks(){
        for (Printable item : library) {
            if (item instanceof Book){
                item.print();
            }
        }
    }
    public static void showMagazines(){
        for (Printable item : library) {
            if (item instanceof Magazine){
                item.print();
            }
        }
    }
}
