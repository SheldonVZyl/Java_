/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudy;


public class Employee {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) { // Intialized fields with constructor
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // Getter and setter methods for all variables 
    
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    
    public String toString(){
        return "\tName: " + getEmpName() + "\n\tID: " + getEmpId() + "\n\tSalary: " + getEmpSalary() + "\n";                
    }
}
