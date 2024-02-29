package Book_2.Chapter_2;


public class HelloApp
{

    public String helloMessage; // instance variable
    public static String helloMessage2; // class variable

    public static void main(String[] args)
    {
        HelloApp ha = new HelloApp(); // creating an instance of a class to use its instance variable.
        ha.helloMessage = "Hello Universe!";
        System.out.println(ha.helloMessage); // using class variable without creating an instance

        helloMessage2 = "Hello World!";
        System.out.println(helloMessage2);
    }
}