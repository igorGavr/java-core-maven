package les_2.one_to_M;

import les_2.one_to_M.entity.Car;
import les_2.one_to_M.entity.Passport;
import les_2.one_to_one.entity.Gender;
import les_2.one_to_M.entity.User;
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
                .addAnnotatedClass(Car.class)
                .getMetadataBuilder()
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        final ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw"));
        cars.add(new Car("zapor"));
        final User pop = new User("pop", cars);
        session.save(pop);

//        session.createQuery("from User u", User.class)
//                        .getResultList()
//                                .forEach(System.out::println);


        session.getTransaction().commit();


        session.close();
        sessionFactory.close();
    }
}
