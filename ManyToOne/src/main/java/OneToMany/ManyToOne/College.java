package OneToMany.ManyToOne;



import jakarta.persistence.*;

@Entity
@Table(name="college")
public class College {

    @Id
    private int collegeId;

    private String collegeName;

    public College() {}

    public College(int collegeId, String collegeName) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
    }

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

   
}
