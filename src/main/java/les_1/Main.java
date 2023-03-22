package les_1;

import les_1.entity.Gender;
import les_1.entity.User;
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
                .addAnnotatedClass(User.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
//        // запити тут
//
//        User user = new User("vasya");
//        session.save(user);

        ArrayList<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        skills.add("html");
        User user = new User("max", skills, Gender.MALE);

        session.save(user);

        session.getTransaction().commit();


//        User user = session.find(User.class, 1L);
//        System.out.println(user);

//        session.createNativeQuery("select * from user_table where id > 0");

        session
                .createQuery("select xxx from User xxx where xxx.id>0", User.class)
                .getResultList()
                .forEach(user1 -> System.out.println(user1));



        session.close();
        sessionFactory.close();


    }
}
