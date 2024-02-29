package Book_3.Chapter_7;

public class AnonClasses
{
    public static void main(String[] args) {
        // Concrete way
        Ball b1 = new BaseBall();
        b1.hit();

        // Anonymous class way:
        Ball b2 = new Ball()
        {
            @Override
            public void hit() {
                System.out.println("You hit the ball. (anon)");
            }
        };
        b2.hit();

        // Lambda way
        Ball b3 = () -> System.out.println("You hit it! (lambda)");
        b3.hit();

    }
}

    class BaseBall implements Ball
    {
        @Override
        public void hit() {
            System.out.println("You hit the baseball. (concrete)");
        }
    }

    interface Ball
    {
        public void hit();
    }


