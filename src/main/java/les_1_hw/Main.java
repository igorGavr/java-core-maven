package les_1_hw;

import les_1.entity.User;
import les_1_hw.entity.Actor;
import les_1_hw.entity.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Actor.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
// тут запити
//        final Actor actor = new Actor("as", "dafdsf");
//        session.save(actor);

//        final Actor actor1 = session.find(Actor.class, 4L);
//        actor1.setFirst_name("bobik");
//        session.update(actor1);
//        session.remove(actor1);
//        System.out.println(actor1);

        ArrayList<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("html");
        Actor user = new Actor(1, "bebik", skills, Gender.MALE, "bilo");

        session.save(user);

        session.getTransaction().commit();

        session
                .createQuery("select a from Actor a", Actor.class)
                .getResultList()
                .forEach(System.out::println);

        session.close();
        sessionFactory.close();
    }
}
