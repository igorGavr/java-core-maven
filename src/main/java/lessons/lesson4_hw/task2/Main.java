package lessons.lesson4_hw.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        HashSet<User> users = new HashSet<>();
        final ArrayList<Skill> skillsUser1 = new ArrayList<>();
        skillsUser1.add(new Skill("ja212va", 12));
        skillsUser1.add(new Skill("jsda", 12));
        final ArrayList<Skill> skillsUser2 = new ArrayList<>();
        skillsUser2.add(new Skill("ja2va", 12));
        skillsUser2.add(new Skill("jsd32a", 12));
        final ArrayList<Skill> skillUser3 = new ArrayList<>();
        skillUser3.add(new Skill("dsa3f", 23));
        final ArrayList<Skill> skillUser4 = new ArrayList<>();
        skillUser4.add(new Skill("ds32af", 23));
        skillUser4.add(new Skill("dsaf", 23));
        skillUser4.add(new Skill("ds3af", 23));
        skillUser4.add(new Skill("d23saf", 23));
        final ArrayList<Skill> skillUser5 = new ArrayList<>();
        skillUser5.add(new Skill("dsa2323f", 23));
        skillUser5.add(new Skill("dsa2f", 23));
        skillUser5.add(new Skill("dsa33f", 23));
        skillUser5.add(new Skill("d3saf", 23));

        Car car1 = new Car("totto", 263, 323);
        Car car2 = new Car("totto", 633, 323);
        Car car3 = new Car("totto", 2333, 323);
//        users.add(new User(1, "vas", "dafds", 23, Gender.MALE, skillsUser1, user1car));
//        users.add(new User(5, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillsUser2, user1car));
//        users.add(new User(3, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillsUser2, user1car));
//        users.add(new User(2, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillUser3, user1car));
//        users.add(new User(4, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillUser3, user1car));
//
//        System.out.println(users);
//        System.out.println(")))))))))))))))))))))))))");
//        final Stream<User> userStream = users.stream()
//                .sorted((o1, o2) -> {
//                    return o1.getSkills().size() - o2.getSkills().size();
//                });
//        final List<User> collect = userStream.collect(Collectors.toList());
//        System.out.println(collect);
//        System.out.println(")))))))))))))))))))))))))");
//        final Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getGender()==Gender.FEMALE){
//                iterator.remove();
//            }
//        }
//        System.out.println(users);

        final TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new User(1, "vas", "dafds", 23, Gender.MALE, skillsUser1, car1));
        treeSet.add(new User(2, "fdvas1", "dfsgafds", 23, Gender.FEMALE, skillsUser2, car1));
        treeSet.add(new User(3, "fdvas2", "dfsgafds", 23, Gender.FEMALE, skillUser3,car3));
        treeSet.add(new User(4, "fdvas3", "dfsgafds", 23, Gender.FEMALE, skillUser4, car2));
        treeSet.add(new User(5, "fdvas4", "dfsgafds", 23, Gender.FEMALE, skillUser5,car2));
        System.out.println(treeSet);


    }
}
