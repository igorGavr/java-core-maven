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

        final Card card1 = new Card("1", new User("chapi"));
        final Card card2 = new Card("2", new User("chapi"));
        session.save(card1);
        session.save(card2);

        session
                .createQuery("select xxx from User xxx where xxx.id>0", User.class)
                .getResultList()
                .forEach(System.out::println);


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
