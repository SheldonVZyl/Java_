package Book_3.Chapter_3;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton si1 = Singleton.getSingleton();
        Singleton si2 = Singleton.getSingleton();

        System.out.println(si1==si2);
    }
}
