package les_2_hw;

import les_2_hw.entity.Car;
import les_2_hw.entity.DriveLicense;
import les_2_hw.entity.Owner;
import les_2_hw.entity.Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        final Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(DriveLicense.class)
                .getMetadataBuilder()
                .build();
        final SessionFactory sessionFactory = metadata
                .getSessionFactoryBuilder()
                .build();
        final Session session = sessionFactory.openSession();
        session.beginTransaction();

        final ArrayList<Car> cars = new ArrayList<>();
cars.add(Car.builder().type(Type.SPORT).volume(23).model("we").build());
cars.add(Car.builder().type(Type.OFFROAD).volume(33).model("sdf").build());
cars.add(Car.builder().type(Type.FAMILY).volume(44).model("fdf").build());

//        final Owner owner = Owner.builder()
//                .name("kokos")
//                .cars(cars)
//                .driveLicense(DriveLicense.builder()
//                        .series("sdfsdf34")
//                        .build())
//                .build();
//
//        session.save(owner);

        final Owner owner = session.find(Owner.class, 1);
        System.out.println(owner.getCars());
        System.out.println(owner.getDriveLicense());

        final Car ca = session.find(Car.class, 1);
//        ca.getOwner

        final DriveLicense driveLicense = session.find(DriveLicense.class, 1);
//        driveLicense.getOwner



        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
