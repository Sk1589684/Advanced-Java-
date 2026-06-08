package OneToMany.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(College.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        College college = new College(2, "IET");

        Student s1 = new Student(37, "Sarvesh", college);
        Student s2 = new Student(53, "Samruddhi", college);
        Student s3 = new Student(36, "Shreyash", college);

        session.persist(college); // save parent first

        session.persist(s1);
        session.persist(s2);
        session.persist(s3);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Data Inserted Successfully");
    }
}