/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CaseStudy;


public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp Starts");
        
        System.out.println("\n--- Employees Information ---");
        
        Employee emp1 = new Employee(887, "Susan", 15000.00);
        
        Employee emp2 = new Employee(23, "John", 17000.00);
        
        
        Department dept = new Department("Education");
        
        dept.addEmp(emp1);
        dept.addEmp(emp2);
        dept.addEmp(new Employee(258, "Mike", 20000));
        
        Employee[] emps = dept.getEmployees();
        
        for(Employee emp: emps){
            System.out.println(emp.toString());            
        }
        System.out.println("Total Salary: " + dept.getTotalSalary());
        System.out.println("Average Salary: " + dept.getAverageSalary());
        
        System.out.println("\nEmployee by ID (23)\n" + dept.getEmployeeByID(23));
    }
    
}
