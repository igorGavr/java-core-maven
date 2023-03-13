package lessons.lesson2_hw.task5;

import lessons.lesson2_hw.task5.enums.HddSsd;
import lessons.lesson2_hw.task5.models.CPU;
import lessons.lesson2_hw.task5.models.HardDrive;
import lessons.lesson2_hw.task5.models.PC;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("korea", 4, 8, "china");
        HardDrive hardDrive = new HardDrive("Japen", 34, HddSsd.SSD);
        PC dell = new PC("DELL", cpu, hardDrive);
        System.out.println(dell);
    }
}
