package les_2.one_to_one;

import les_2.one_to_one.entity.Gender;
import les_2.one_to_one.entity.Passport;
import les_2.one_to_one.entity.User;
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
                .addAnnotatedClass(Passport.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        ArrayList<String> skills = new ArrayList<>();
//        skills.add("java");
//        skills.add("js");
//        skills.add("html");
//
//        final User user = new User("sdfa", new Passport("sdafdsf"), Gender.MALE);
//        session.save(user);

//        Passport passport = new Passport("176r36yfd1yhe8re");
//        session.save(passport);
//        User user = new User("abrikos");
//        session.save(user);

//        User user2 = session.find(User.class, 2L);
//        Passport passport2 = session.find(Passport.class, 2);
//        user2.setPassport(passport2);


        session.createQuery("from User u", User.class)
                        .getResultList()
                                .forEach(System.out::println);


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
