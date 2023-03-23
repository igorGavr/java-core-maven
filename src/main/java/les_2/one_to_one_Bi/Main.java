package les_2.one_to_one_Bi;

import les_2.one_to_one_Bi.entity.Passport;
import les_2.one_to_one_Bi.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


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

        final Passport passport = session.find(Passport.class, 1);
        System.out.println(passport.getUser());
//        final User user = session.find(User.class, 1L);
//        passport.setUser(user);
//        System.out.println(passport);

//        final User user = session.find(User.class, 1L);
////        user.setPassport(passport);
//        System.out.println(user);
//        System.out.println(user.getPassport());

//        session.createQuery("from User u", User.class)
//                        .getResultList()
//                                .forEach(System.out::println);


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
