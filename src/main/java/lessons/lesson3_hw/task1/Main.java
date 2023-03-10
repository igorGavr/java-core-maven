package lessons.lesson3_hw.task1;

import lessons.lesson3_hw.task1.models.Book;
import lessons.lesson3_hw.task1.models.Library;
import lessons.lesson3_hw.task1.models.Magazine;

//а) Определить интерфейс Printable, содержащий метод void print().
//б) Определить класс Book, реализующий интерфейс Printable.
//в) Определить класс Magazine, реализующий интерфейс Printable.
//г) Создать массив типа Printable, который будет содержать книги и журналы.


public class Main {
    public static void main(String[] args) {
        Library.add(new Book("book1"));
        Library.add(new Magazine("ma2"));
        Library.add(new Book("book2"));
        Library.add(new Magazine("ma1"));
        Library.showBooks();
        System.out.println("***(*(*(*(*(***");
        Library.showMagazines();
    }
}
