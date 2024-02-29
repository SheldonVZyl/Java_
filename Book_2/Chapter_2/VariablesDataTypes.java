package Book_2.Chapter_2;

public class VariablesDataTypes {

    public static void main(String[] args) {
        int taxRate = 10;
        double subTotal = 100;
        double total = 1000;
        double taxAmount = 0;

        if (taxRate > 0) {
            taxAmount = subTotal * taxRate;
            total = subTotal + total;
        }

        System.out.println(taxAmount);

        int xInt;
        long yLong;
        xInt = 32;
        yLong = xInt;
        yLong = 32;
        // xInt = yLong; NOT allowed
        long xLong1 = 58473882;
        long xLong2 = 58_473_882;

        char code = '\b';

        class Ball {
            int speed; // integer

            void setSpeed(int speed) { // Set Method
                // Sets the instance variable equal to the variable passed in the parameter
                this.speed = speed;
            }
        }

        Ball b1 = new Ball();
        Ball b2 = b1;

        b1.setSpeed(50);
        System.out.println("Speed of Ball 1 is: " + b1.speed + " and Ball 2 speed: " + b2.speed);
        b2.setSpeed(100);
        // Notice that the speed of Ball 1 also changes even though we changed the speed of ball 2
        // This is because the variables stores the reference to the object in memory, not the contents of the object itself.
        // So when we assigned b2 = b1, b2 points to the b1 address in memory. It does not make its own copy of b1
        System.out.println("Speed of Ball 1 is: " + b1.speed + " and Ball 2 speed: " + b2.speed);

        String hello = "Hello, ";
        String world = "World!";
        String greeting = hello + world;
        System.out.println(greeting);

        int y = 5;
        String str = Integer.toString(y);

        String s = "10";
        int x = Integer.parseInt(s);
        float x2 = Float.parseFloat(s);
        double x3 = Double.parseDouble(s);

        System.out.println(x + " " + x2 + " " + x3);
    }

}
