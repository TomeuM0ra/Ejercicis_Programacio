package example.domain2;

public class employee {
    private int empId ;
    private String name;
    private String ssn;
    private double salary;
    public employee(int empId, String name, String ssn, double
            salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    public String getName(){
      return this.name;
    }
    public int getEmpId() {
        return this.empId;
    }
    public String getSsn() {
        return this.ssn;
    }
    public double getSalary() {
        return this.salary;
    }
    public void raiseSalary(double increase){
        salary += increase;
    }
}
