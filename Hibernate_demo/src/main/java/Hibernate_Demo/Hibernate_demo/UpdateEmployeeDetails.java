package Hibernate_Demo.Hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeDetails{

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // Fetch Existing Employee
        Employee emp = session.get(Employee.class, 101);

        if(emp != null) {

            emp.setName("Sarvesh Kulkarni");
            emp.setSalary(75000);

            session.merge(emp);

            tx.commit();

            System.out.println("Employee Updated Successfully");

        } else {

            System.out.println("Employee Not Found");
        }

        session.close();
        factory.close();
    }
}