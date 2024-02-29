package Book_3.Chapter_3;

public class StaticInit {
    public static int x;

    static {
        x = 32;
        System.out.println("X value from static init: " + x);
    }

    public StaticInit() {
        System.out.println("In the constructor.");
        x = 64;
    }

    public static void main(String[] args) {
        System.out.println("X value from main before instantiation: " + StaticInit.x);
        StaticInit si = new StaticInit();
        System.out.println("X value from main after constructor: " + StaticInit.x);
    }

}
