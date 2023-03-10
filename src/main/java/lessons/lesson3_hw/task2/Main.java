package lessons.lesson3_hw.task2;

import lessons.lesson3_hw.task2.interfaces.Instrument;
import lessons.lesson3_hw.task2.models.Drum;
import lessons.lesson3_hw.task2.models.Guitar;
import lessons.lesson3_hw.task2.models.Pipe;

import java.util.Arrays;
import java.util.List;

//  Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//  Интерфейс Инструмент содержит метод play()
//  Гитара содержит переменные класса количествоСтрун,
//  Барабан - размер, Труба - диаметр. Создать массив типа Инструмент,
//  содержащий инструменты разного типа.
//  В цикле вызвать метод play() для каждого инструмента,
//  который должен выводить строку "Играет такой-то инструмент c такими
//  то характеристиками".


public class Main {
    public static void main(String[] args) {
        List<Instrument> instrumentList = Arrays.asList(
                new Pipe(23),
                new Drum(23),
                new Guitar(12)
        );
        for (Instrument instrument : instrumentList) {
            instrument.play();
        }
    }
}
