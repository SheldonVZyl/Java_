package Book_3.Chapter_2;

public class PlayApp {

    public static void main(String[] args) {
        // Directly accessing variables
        Player john = new Player();
        john.health = 500;
        System.out.println("John health " + john.health);

        // Getters and Setters
        Player p1 = new Player();
        p1.setHealth(10);
        System.out.println("Player 1 health status: " + p1.getHealth());

        Player p2 = new Player();
        p2.setHealth(-12);
        System.out.println("Player 2 health status: " + p2.getHealth());

        Player p3 = new Player();
        p3.setHealth(120);
        System.out.println("Player 3 health status: " + p3.getHealth());
    }
}
