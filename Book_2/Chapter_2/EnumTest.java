package Book_2.Chapter_2;

public class EnumTest
{
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}
