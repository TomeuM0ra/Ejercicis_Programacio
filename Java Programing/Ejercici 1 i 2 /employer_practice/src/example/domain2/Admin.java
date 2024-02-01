package example.domain2;

public class Admin extends employee{
    private String admName;
    public Admin(int empId, String name, String ssn, double salary, String admName){
        super(empId, name, ssn, salary);
        this.admName= admName;
    }


    public void getname(String admName){
        this.admName= admName;
    }
}
