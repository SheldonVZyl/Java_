package Book_3.Chapter_6;

public class TestEqualityCloning {

    public static void main(String[] args) {
        // EQUALITY TEST
        Employee emp1 = new Employee("Mark", "Drinkwater");
        Employee emp2 = new Employee("Mark", "Drinkwater");
        Worker wrk = new Worker("Mark", "Drinkwater");

        System.out.println("Are emp1 and emp1 equal? " + emp1.equals(emp1));
        System.out.println("Are emp1 and emp2 equal? " + emp1.equals(emp2));
        System.out.println("Are emp1 and wrk1 equal? " + emp1.equals(wrk));
        System.out.println("Are emp1 and NULL equal? " + emp1.equals(null));

        // CLONING
        System.out.println("\nLet the cloning begin!");
        Employee emp3 = (Employee) emp1.clone();

        System.out.println("Are emp1 and emp3 equal? " + emp1.equals(emp2));
    }
}
