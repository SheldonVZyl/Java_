package Book_3.Chapter_2;

public class Player {
    public int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 ) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

}
