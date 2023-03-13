package lessons.lesson3_hw.task3;
//1. Створити енум, який містить розміри одягу
// (XXS, XS, S, M, L). Написати в ньому  метод
// getDescription.
// Додати в енум в поле int euroSize, написати
// конструктор, який параметром буде приймати
// значення для поля.
// 2. Створити інтерфейси "Чоловічий одяг" з методом
// "вдягнути чоловіка" і "Жіночий одяг" з методом
// "одягнути жінку".
// 3. Створити абстрактний клас Одяг, який має такі поля:
// розмір одягу (використати створений енум), вартість,
// колір.
// 4. Створити класи нащадки до класу Одяг - Футболка
// (реалізує також інтерфейси Чоловічий одяг і Жіночий
// одяг), Штани (реалізує також інтерфейси Чоловічий
// одяг і Жіночий одяг), Плаття (реалізує інтерфейс
// "Жіночий одяг"), Галстук (реалізує інтерфейси
// Чоловічий одяг).
// 5. Створити клас Ательє, який має полем масив
// об'єктів Одяг (тобто в ньому можуть бути об'єкти
// усіх класів-нащадків), та 2 методи - чоловічий
// вибір (повертає увесь ЧОЛОВІЧИЙ одяг
// (підказка: instanceof оператор допоможе -> if(a instanceof X){...}))
// та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).


import lessons.lesson3_hw.task3.enums.Size;
import lessons.lesson3_hw.task3.models.Atelier;
import lessons.lesson3_hw.task3.models.Clothes;
import lessons.lesson3_hw.task3.models.Dress;
import lessons.lesson3_hw.task3.models.Pants;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Atelier atelier = new Atelier();
        atelier.addClothes(new Pants(Size.M, 234, "red"));
        atelier.addClothes(new Pants(Size.XS, 234, "red"));
        atelier.addClothes(new Pants(Size.M, 234, "red"));
        atelier.addClothes(new Dress(Size.M, 433, "black"));

        ArrayList<Clothes> atelierClothes = atelier.getClothes();
        System.out.println(atelierClothes);

        atelier.getManClothes();
        atelier.getWomanClothes();

    }
}
