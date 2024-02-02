package com.example.domain;

public class Employee {
   public int EmployeeId ;
   public String EmployeeName;
   public String EmployeeSSN;
   public double EmployeeSalary;

public Employee(){

}
public int getEmployeeId(){
      return EmployeeId;
}
public String getEmployeeName(){
      return EmployeeName;
}
public String getEmployeeSSN(){
      return EmployeeSSN;
}
public double getEmployeeSalary(){
      return EmployeeSalary;
}
public void setEmployeeId(int employeeId){
   this.EmployeeId= employeeId;
}
public void setEmployeeName(String employeeName){
   this.EmployeeName= employeeName;
}
public void setEmployeeSSN(String employeeSSN){
   this.EmployeeSSN= employeeSSN;
}
public void setEmployeeSalary(double employeeSalary){
   this.EmployeeSalary= employeeSalary;
}
}
