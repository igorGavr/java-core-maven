package les_2.M_to_one;

import les_2.M_to_one.entity.Card;
import les_2.M_to_one.entity.Gender;
import les_2.M_to_one.entity.Passport;
import les_2.M_to_one.entity.User;
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
                .addAnnotatedClass(Card.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        final User re = new User("re");
        final Card card1 = new Card("22", re);
        final Card card2 = new Card("22", re);
        session.save(re);
        session.save(card1);
        session.save(card2);

        final User user = session.find(User.class, 1L);
        System.out.println(user);
//        System.out.println(user.getCards());  // error

        System.out.println("&*&*&*&*&*&*");

        final Card card = session.find(Card.class, 2);
        System.out.println(card);
        System.out.println(card.getUser());


//        session
//                .createQuery("select xxx from User xxx where xxx.id>0", User.class)
//                .getResultList()
//                .forEach(System.out::println);


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
