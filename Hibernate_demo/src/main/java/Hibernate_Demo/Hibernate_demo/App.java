package Hibernate_Demo.Hibernate_demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration().configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Employee emp = new Employee(104,"Gopal",50000);

        session.persist(emp);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Record Inserted Successfully");
    }
}
