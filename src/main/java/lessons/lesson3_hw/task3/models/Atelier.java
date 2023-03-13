package lessons.lesson3_hw.task3.models;


import lessons.lesson3_hw.task3.interfaces.Man;
import lessons.lesson3_hw.task3.interfaces.Woman;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data

@AllArgsConstructor

public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
        this.clothes = new ArrayList<>();
    }

    public void addClothes(Clothes item) {
        this.clothes.add(item);
    }

    public ArrayList<Man> getManClothes() {
        ArrayList<Man> menArrayClothes = new ArrayList<>();
        for (Clothes item : this.clothes) {
            if (item instanceof Man) {
                Man manItem = (Man) item;
                manItem.DressMan();
                menArrayClothes.add(manItem);
            }
        }
        return menArrayClothes;
    }

    public ArrayList<Woman> getWomanClothes() {
        ArrayList<Woman> womanArrayClothes = new ArrayList<>();
        for (Clothes item : this.clothes) {
            if (item instanceof Woman) {
                Woman womanItem = (Woman) item;
                womanItem.DressWoman();
                womanArrayClothes.add(womanItem);
            }
        }
        return womanArrayClothes;
    }
}
