package Hibernate_Demo.Hibernate_demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmpDetails {

	public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // Fetch Employee
        Employee emp = session.get(Employee.class, 104);

        if(emp != null) {

            session.remove(emp);

            tx.commit();

            System.out.println("Employee Deleted Successfully");

        } else {

            System.out.println("Employee Not Found");
        }

        session.close();
        factory.close();
    }
}