package Book_2.Chapter_3;

public class RoundingApp
{
    public static void main(String[] args)
    {
        double x = 29.4;
        double y = 93.5;
        double z = -19.3;
        System.out.println("round(x) = " + Math.round(x));
        System.out.println("round(y) = " + Math.round(y));
        System.out.println("round(z) = " + Math.round(z));
        System.out.println();
        System.out.println("ceil(x) = " + Math.ceil(x));
        System.out.println("ceil(y) = " + Math.ceil(y));
        System.out.println("ceil(z) = " + Math.ceil(z));
        System.out.println();
        System.out.println("floor(x) = " + Math.floor(x));
        System.out.println("floor(y) = " + Math.floor(y));
        System.out.println("floor(z) = " + Math.floor(z));
        System.out.println();
        System.out.println("rint(x) = " + Math.rint(x));
        System.out.println("rint(y) = " + Math.rint(y));
        System.out.println("rint(z) = " + Math.rint(z));
        System.out.println();

        System.out.println("Example showing difference between round and rint.");
        double a = 4.5;
        // Round will always round up when halfway, whereas rint will choose
        // whichever int is an even number
        System.out.println("round(a) = " + Math.round(a)); // get 5 expected
        System.out.println("rint(a) = " + Math.rint(a)); // get 4, because 4 is even number
    }
}