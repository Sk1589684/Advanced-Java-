package OneToMany.Department;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration()
                .configure()
                .buildSessionFactory();

        Session session =
                factory.openSession();

        Transaction tx =
                session.beginTransaction();

        Employee e1 =
                new Employee(101,"Sarvesh");

        Employee e2 =
                new Employee(102,"Rahul");

        Employee e3 =
                new Employee(103,"Amit");

        Department dept =
                new Department(
                        1,
                        "IT",
                        Arrays.asList(e1,e2,e3));

        session.persist(dept);

        tx.commit();

        session.close();
        factory.close();

        System.out.println(
                "Department and Employees Saved");
    }
}