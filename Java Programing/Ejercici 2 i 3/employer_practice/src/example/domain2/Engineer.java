package example.domain2;

public class Engineer extends employee {
    private String engName;

    public Engineer(int empId, String name, String ssn, double salary, String engName) {
        super(empId, name, ssn, salary);
        this.engName = engName;
    }

    public void getname(String engName) {
        this.engName = engName;
    }
}
