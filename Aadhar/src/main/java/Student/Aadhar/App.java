package Student.Aadhar;



import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration cfg =
                new Configuration().configure();

        SessionFactory factory =
                cfg.buildSessionFactory();

        Session session =
                factory.openSession();

        Transaction tx =
                session.beginTransaction();

        AadhaarCard card =
                new AadhaarCard(
                        2,
                        "1234-5678-1092");

        Student student =
                new Student(
                        102,
                        "Shreyash",
                        card);

        session.persist(student);

        tx.commit();

        session.close();
        factory.close();

        System.out.println(
            "Student and Aadhaar Saved Successfully");
    }
}