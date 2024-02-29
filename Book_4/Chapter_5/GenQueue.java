package Book_4.Chapter_5;

import java.util.LinkedList;

public class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q)
    {
        while (q.hasItems())
            list.addLast(q.dequeue());
    }

}

class GenQueueTest
{
    public static void main(String[] args)
    {
        // Created 2 lists one for employees and another for hourly employees
        GenQueue<Employee> empList = new GenQueue<>();
        GenQueue<HourlyEmployee> hList = new GenQueue<>();

        // Create 3 hourly employees
        hList.enqueue(new HourlyEmployee( "Trump", "Donald"));
        hList.enqueue(new HourlyEmployee( "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee( "Forbes", "Steve"));

        // Storing hourly employees inside the employee list, which is allowed because of the wildcard: GenQueue<? extends E>
        empList.addItems(hList);

        while (empList.hasItems())
        {
            Employee emp = empList.dequeue();
            System.out.println(emp);
        }

    }
}

class Employee
{
    public String lastName;
    public String firstName;
    public Employee() {}
    public Employee(String last, String first)
    {
        this.lastName = last;
        this.firstName = first;
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
class HourlyEmployee extends Employee
{
    public double hourlyRate;
    public HourlyEmployee(String last, String first)
    {
        super(last, first);
    }
}