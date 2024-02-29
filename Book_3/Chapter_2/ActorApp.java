package Book_3.Chapter_2;

public class ActorApp {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Arnold", "Schwarzenegger", true);
        Actor actor2 = new Actor("Keanu", "Reeves");
        Actor actor3 = new Actor("Brad", "Pitt", false);

        System.out.println(actor1.getFirstName() + " " + actor1.getLastName() + " is a " + (actor1.isGoodActor() ? "good" : "bad") + " actor" );
        System.out.println(actor2.getFirstName() + " " + actor2.getLastName() + " is a " + (actor2.isGoodActor() ? "good" : "bad") + " actor" );
        System.out.println(actor3.getFirstName() + " " + actor3.getLastName() + " is a " + (actor3.isGoodActor() ? "good" : "bad") + " actor" );

        System.out.println(actor1.toString());
    }
}
