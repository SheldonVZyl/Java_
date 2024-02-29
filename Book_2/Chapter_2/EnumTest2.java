package Book_2.Chapter_2;

public class EnumTest2
{
    public enum MoonPhase {NEW_MOON, WAXING_CRESCENT, FIRST_QUARTER, WAXING_GIBBOUS, FULL_MOON, WANING_GIBBOUS, LAST_QUARTER, WANING_CRESCENT}

    public static void main(String[] args) {
        MoonPhase phase;
        phase = MoonPhase.FULL_MOON;
        System.out.println("Today's moon phase is a " + phase);
    }
}
