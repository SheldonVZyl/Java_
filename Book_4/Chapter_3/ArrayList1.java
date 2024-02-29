package Book_4.Chapter_3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 implements Iterable {

    public static void main (String[] args) {

        ArrayList signs3;

        ArrayList signs1 = new ArrayList();
        ArrayList signs2 = new ArrayList(100);

        signs2.add(88);
        signs2.add("hi");
        System.out.println(signs2);

        ArrayList<String> stringsOnly = new ArrayList<>();
        stringsOnly.add("Mark");
        Employee emp1 = new Employee("Mark", "Drinkwater");
        stringsOnly.add(emp1.toString());

        System.out.println(stringsOnly);

        ArrayList<Employee> empList = new ArrayList<>();
//        Employee emp1 = new Employee("Mark", "Drinkwater");
        empList.add(emp1);
        System.out.println(empList);

        ArrayList<String> nums = new ArrayList<>(2);
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add("Five");

        String first = nums.set(0, "Uno");
        String second = nums.set(1, "Dos");
        String third = nums.set(2, "Tres");

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(nums);
        System.out.println(nums.size());
//        nums.add(10, "Ten");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println( nums.get(i) );
        }

        for (String num: nums) {
            int i = nums.indexOf(num);
            System.out.println("Item " + i + ": " + num);
        }

        Iterator e = nums.iterator();
        String s;

        while (e.hasNext())
        {
            s = (String) e.next();
//            System.out.println(s);
        }


        ArrayList<String> spanishCounting = new ArrayList<>();
        spanishCounting.add("Uno");
        spanishCounting.add("Dos");
        spanishCounting.add("Tres");
        spanishCounting.add("Cuatro");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println( nums.set(i, spanishCounting.get(i)) );
        }

        System.out.println(nums);

    }

    @Override
    public Iterator iterator() {
        return null;
    }


}

class Employee {
    String lastName;
    String firstName;
    public Employee (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}