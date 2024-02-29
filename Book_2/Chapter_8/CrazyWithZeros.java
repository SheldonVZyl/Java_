package Book_2.Chapter_8;

public class CrazyWithZeros
{
    public static void main(String[] args) {
        try {
            int answer = divideTheseNumbers(5, 0);
        } catch (Exception e) {
            System.out.println("Tried twice it still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b) // Not explicitly necessary unless the compiler requires it: throws Exception
    {
        int c = 0;
        try {
            c = a / b;
            System.out.println("It worked");
        } catch (Exception e) {
            System.out.println("Didn't work the first time.");
//            c = a / b;
            System.out.println("It worked the second time!");
        } finally {
            System.out.println("Better clean up my mess.");
        }
        System.out.println("It worked after all");
        return c;
    }
}
