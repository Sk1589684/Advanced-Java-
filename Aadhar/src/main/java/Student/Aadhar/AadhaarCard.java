package Student.Aadhar;


import jakarta.persistence.*;

@Entity
@Table(name="aadhaar")
public class AadhaarCard {

    @Id
    private int aadhaarId;

    private String aadhaarNumber;

    public AadhaarCard() {
    }

    public AadhaarCard(int aadhaarId,
                       String aadhaarNumber) {
        this.aadhaarId = aadhaarId;
        this.aadhaarNumber = aadhaarNumber;
    }

    public int getAadhaarId() {
        return aadhaarId;
    }

    public void setAadhaarId(int aadhaarId) {
        this.aadhaarId = aadhaarId;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }
}