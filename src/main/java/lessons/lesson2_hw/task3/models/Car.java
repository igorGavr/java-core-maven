package lessons.lesson2_hw.task3.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private String model;
    private int year;
    private  int power;

}
