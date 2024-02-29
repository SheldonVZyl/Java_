package Book_2.Chapter_3;

public class Arithmetic
{
    public static void main(String[] args) {
        int a = 21;
        double b = 6;
        // If you want to keep the decimal, cast either int to a double. Because an int / int will always give an int and truncate the decimal.
        double answer = (double) a / b;
        System.out.println(answer);

        int a1 = 3, b1 = 4, c1 = 5;
        int d1 = a1 * -(b1 + c1); // d is -27
    }
}
