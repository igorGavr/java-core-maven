package les_2.M_to_M;

import les_2.M_to_M.entity.Passport;
import les_2.M_to_M.entity.Sunglasses;
import les_2.M_to_M.entity.User;
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
                .addAnnotatedClass(Sunglasses.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

//        final User user1 = new User();
//        final User user2 = new User();
//        final Sunglasses sunglasses1 = new Sunglasses();
//        final Sunglasses sunglasses2 = new Sunglasses();
//
//        session.save(user1);
//        session.save(user2);
//        session.save(sunglasses1);
//        session.save(sunglasses2);
//
//        user1.getSunglasses().add(sunglasses1);
//        user1.getSunglasses().add(sunglasses2);

        final Sunglasses sunglasses = session.find(Sunglasses.class, 5);
        System.out.println(sunglasses.getUsers());


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
