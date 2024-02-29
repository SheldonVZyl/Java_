package Book_2.Chapter_2;

public class ShadowApp {

    static int x;

    public static void main(String[] args) {
        // Class Variable
        x = 5;
        System.out.println("x = " + x);
        // Shadow instance variable
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " + ShadowApp.x);
    }
}
