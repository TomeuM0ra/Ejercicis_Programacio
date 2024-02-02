import com.example.domain.Employee;
import example.domain2.*;

public class employeetest {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setEmployeeId(101);
        em.setEmployeeName("Jane Smith");
        em.setEmployeeSSN("012-34-4567");
        em.setEmployeeSalary(120_345.24);
        System.out.println(em.getEmployeeId()+"-_-"+em.getEmployeeName()+"-_-"+em.getEmployeeSSN()+"-_-"+em.getEmployeeSalary());

        employee eng = new Engineer(101, "Jane Smith","012-34-3456", 120_345.24, "Enginner" );
        employee man = new Manager(207, "Barbara Johnson","054-12-2367", 109_501.36, "US Marketing" );
        employee adm = new Admin(304, "Bill Monroe","108-23-6509", 75_002.34, "Admin" );
        employee dir = new Director(12, "Susan Wheeler","099-45-2340", 120_567.36, "Global Marketing",1_000_000.00 );

        printemployee(eng);
        printemployee(man);
        printemployee(adm);
        printemployee(dir);
    }
    public static void printemployee(employee eng){
        System.out.println();
        System.out.println ("Employee id: " + eng.getEmpId());
        System.out.println ("Employee name: " + eng.getName());
        System.out.println ("Employee Soc Sec #: " + eng.getSsn());
        System.out.println ("Employee salary: " + eng.getSalary());
    }
}
