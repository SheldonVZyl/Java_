package Book_4.Chapter_3;

import java.util.ArrayList;

public class ArrayList2
{
    public static void main (String args[])
    {
        // Create 2 array lists
        ArrayList<Employee> emps1 = new ArrayList<>();
        ArrayList<Employee> emps2 = new ArrayList<>();

        // Create 3 employees
        Employee emp1 = new Employee("Mark", "Drinkwater");
        Employee emp2 = new Employee("Addam", "Gomez");
        Employee emp3 = new Employee("James", "Jones");

        // Add 3 employees to emp list 1
        emps1.add(emp1);
        emps1.add(emp2);
        emps1.add(emp3);
        // Add 2 employees to emp list 2
        emps2.add(emp1);
        emps2.add(emp3);

        // Print arraylist before retainAll.
        System.out.println(emps1);
//         emps1.removeAll(emps2);

        emps1.retainAll(emps2);

        // Print arraylist after retainAll.
        System.out.println(emps1);
    }
}
