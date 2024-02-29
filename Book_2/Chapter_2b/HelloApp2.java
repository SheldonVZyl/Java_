package Book_2.Chapter_2b;

import Book_2.Chapter_2.HelloApp;

public class HelloApp2 {

    public static void main(String[] args) {
        // INSTANCE VARIABLES
        HelloApp h = new HelloApp(); //creating instance of HelloApp to use its instance variable
        h.helloMessage = "hi there";
        System.out.println(h.helloMessage);

        // STATIC VARIABLES/CLASS
        System.out.println(HelloApp.helloMessage2); // printing a class/static variable from HelloApp using it's class name in front.

        HelloApp.main(args); //running static/class method of Hello App

    }

}
