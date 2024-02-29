package Book_3.Chapter_5;

public interface Playable {

    void play();

    default void quit() {
        System.out.println("Not allowed to quit.");
    }
}
