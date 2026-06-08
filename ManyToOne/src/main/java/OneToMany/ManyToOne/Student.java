package OneToMany.ManyToOne;



import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    private int studentId;

    private String studentName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="college_id")
    private College college;

    public Student() {}

    public Student(int studentId,
                   String studentName,
                   College college) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

}