package ManyToMany.Hib;


import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
    	

    	        Configuration cfg = new Configuration();
    	        cfg.configure();

    	        SessionFactory factory =
    	                cfg.buildSessionFactory();

    	        Session session =
    	                factory.openSession();

    	        Transaction tx =
    	                session.beginTransaction();

    	        Course c1 =
    	                new Course(1, "Java");

    	        Course c2 =
    	                new Course(2, "Python");

    	        Student s1 =
    	                new Student(
    	                        37,
    	                        "Sarvesh",
    	                        Arrays.asList(c1, c2));

    	        Student s2 =
    	                new Student(
    	                        36,
    	                        "Shreyash",
    	                        Arrays.asList(c1));

    	        session.persist(c1);
    	        session.persist(c2);

    	        session.persist(s1);
    	        session.persist(s2);

    	        tx.commit();

    	        session.close();
    	        factory.close();

    	        System.out.println("Data Inserted Successfully");
    	    }
    	
    }

