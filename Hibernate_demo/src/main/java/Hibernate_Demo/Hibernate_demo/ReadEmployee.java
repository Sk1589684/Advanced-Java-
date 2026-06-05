package Hibernate_Demo.Hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadEmployee {

	public static void main(String[] args) {

	        Configuration cfg = new Configuration().configure();

	        SessionFactory factory = cfg.buildSessionFactory();

	        Session session = factory.openSession();

	        // Read Employee by ID
	        Employee emp = session.get(Employee.class, 101);

	        if(emp != null) {

	            System.out.println("Employee Details");
	            System.out.println("------------------");

	            System.out.println("ID     : " + emp.getId());
	            System.out.println("Name   : " + emp.getName());
	            System.out.println("Salary : " + emp.getSalary());

	        } else {

	            System.out.println("Employee Not Found");
	        }

	        session.close();
	        factory.close();
	    }
	}
