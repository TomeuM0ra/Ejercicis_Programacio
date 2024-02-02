package example.domain2;

public class Manager extends employee{
    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName= deptName;

    }
    public void getname(String deptName){
        this.deptName= deptName;
    }

}
