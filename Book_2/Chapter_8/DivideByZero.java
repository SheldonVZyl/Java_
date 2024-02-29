package Book_2.Chapter_8;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 5, b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("You may not divide by zero");
        }
    }
}
