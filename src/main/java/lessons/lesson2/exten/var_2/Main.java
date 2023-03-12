package lessons.lesson2.exten.var_2;

public class Main {
    public static void main(String[] args) {

        Archer archer = new Archer(12, 12, Type.DISTANCE);
        GreenDragon greenDragon = new GreenDragon(12, 12, Type.FLY);
        Forest[] forests = {archer, greenDragon};

        Garpy garpy = new Garpy(12, 12, Type.FLY);
        BlackDragon blackDragon = new BlackDragon(12, 12, Type.FLY);
        Dungeon[] dungeons = {blackDragon, garpy};

        Unit[] units = {archer, blackDragon, garpy, greenDragon};

// abstract class дозволяє неможливість створення таких обєктів
//        Dungeon dungeon = new Dungeon(12, 12, Type.FLY);  // error
    }
}
