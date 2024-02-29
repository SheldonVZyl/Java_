package Book_2.Chapter_3;

public class DiceApp
{
    public static void main(String[] args) {
        int roll;
        String msg = "We are rolling the dice 100 times.";
        System.out.println(msg);
        for (int i = 0; i < 100; i++) {
            roll = randomInt(1, 6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }

    public static int randomInt(int low, int high)
    {
        int result = (int)(Math.random() * (high - low + 1)) + low;
        return result;
    }
}
