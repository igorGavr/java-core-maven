package lesson2.task2;

import lesson2.task2.enums.CpuEnum;
import lesson2.task2.models.Ultrabook;
import lesson2.task2.models.Workstation;

public class Main {
    public static void main(String[] args) {
        Ultrabook U1 = new Ultrabook(CpuEnum.M1, 100, 12, 22, 2.5);
        Workstation W1 = new Workstation(CpuEnum.INTEL, 12, 12, 12.4, 23);

        System.out.println(U1);
        System.out.println(W1);
    }
}
