package Student.Aadhar;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    private int studentId;

    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="aadhaar_id")
    private AadhaarCard aadhaarCard;

    public Student() {
    }

    public Student(int studentId, String studentName,
                   AadhaarCard aadhaarCard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.aadhaarCard = aadhaarCard;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public AadhaarCard getAadhaarCard() {
        return aadhaarCard;
    }

    public void setAadhaarCard(AadhaarCard aadhaarCard) {
        this.aadhaarCard = aadhaarCard;
    }
}