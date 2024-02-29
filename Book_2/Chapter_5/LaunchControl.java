package Book_2.Chapter_5;

public class LaunchControl {

    public static void main(String[] args) {
        System.out.println("We are going to launch in T minus");

        for (int count = 10; count > 0; count--)
        {
//            if (count == 8) {
//                System.out.println("Ignition sequence started!");
//            } else {
//                System.out.println(count + "...");
//            }

                System.out.println( (count==8) ?  "Ignition sequence started!" : count + "...");


            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        System.out.println("All engines running!\nLiftoff! We have liftoff!");

        // Body-less for loop
        for (int count = 10; count > 0; System.out.println( (count==8) ?  "Ignition sequence started!" : count + "..."), count--);
    }
}
