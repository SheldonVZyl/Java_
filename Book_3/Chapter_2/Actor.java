package Book_3.Chapter_2;

public class Actor {

    private String firstName;
    private String lastName;
    private boolean isGoodActor;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGoodActor() {
        return isGoodActor;
    }

    public void printObject() {
        System.out.println(this);
    }

    public void setGoodActor(boolean goodActor) {
        this.isGoodActor = goodActor;
    }

    public Actor(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(String first, String last, boolean good)
    {
        this.firstName = first;
        this.lastName = last;
        this.isGoodActor = good;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isGoodActor=" + isGoodActor +
                '}';
    }

}
