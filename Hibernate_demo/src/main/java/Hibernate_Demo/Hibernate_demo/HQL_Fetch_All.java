package Hibernate_Demo.Hibernate_demo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Fetch_All {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure()
                                   .buildSessionFactory();

        Session session = factory.openSession();

        String hql = "from Employee";

        List<Employee> employees =
                session.createQuery(hql, Employee.class)
                       .list();

        for(Employee emp : employees) {

            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());

            System.out.println("----------------");
        }

        session.close();
        factory.close();
    }
}
