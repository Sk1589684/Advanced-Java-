package OneToMany.Department;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    private int deptId;

    private String deptName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="dept_id")
    private List<Employee> employees;

    public Department() {
    }

    public Department(int deptId, String deptName,
                      List<Employee> employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = employees;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
