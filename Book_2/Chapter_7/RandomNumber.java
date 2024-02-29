package Book_2.Chapter_7;

public class RandomNumber {

    public static void main(String[] args) {
        int number = getRandomNumber(1, 10);
        System.out.println("NUMBER is: " + number);
    }

    public static int getRandomNumber(int min, int max) {
        int num = (int) Math.floor( Math.random() * (max-min+1) ) + min;
        return num;
    }
}