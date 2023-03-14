package lessons.lesson4_hw.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        HashSet<User> users = new HashSet<>();
        final ArrayList<Skill> skillsUser1 = new ArrayList<>();
        skillsUser1.add(new Skill("java", 12));
        skillsUser1.add(new Skill("jsda", 12));
        skillsUser1.add(new Skill("jasva", 12));
        final ArrayList<Skill> skillsUser2 = new ArrayList<>();
        skillsUser2.add(new Skill("java", 12));
        skillsUser2.add(new Skill("jsda", 12));
        final ArrayList<Skill> skillUser3 = new ArrayList<>();
        skillUser3.add(new Skill("dsaf", 23));

        Car user1car = new Car("totto", 2333, 323);
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
        treeSet.add(new User(1, "vas", "dafds", 23, Gender.MALE, skillsUser1, user1car));
        treeSet.add(new User(5, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillsUser2, user1car));
        treeSet.add(new User(3, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillsUser2, user1car));
        treeSet.add(new User(2, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillUser3, user1car));
        treeSet.add(new User(4, "fdvas", "dfsgafds", 23, Gender.FEMALE, skillUser3, user1car));
        System.out.println(treeSet);
    }
}
