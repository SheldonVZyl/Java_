package Book_4.Chapter_6;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class Spell
{
    public String name;
    public SpellType type;
    public String description;
    public int price;
    public enum SpellType {SPELL, CHARM, CURSE}
    public Spell(String name, SpellType type, String description, int price)
    {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.type + " " + this.description;
    }

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", SpellType.SPELL,
                "Makes invisible ink appear.", 10));
        spells.add(new Spell("Avis", SpellType.SPELL,
                "Launches birds from your wand.", 5));
        spells.add(new Spell("Engorgio", SpellType.CHARM,
                "Enlarges something.", 20));
        spells.add(new Spell("Fidelius", SpellType.CHARM,
                "Hides a secret within someone.", 23));
        spells.add(new Spell("Finite Incatatum", SpellType.SPELL,
                "Stops all current spells.", 30));
        spells.add(new Spell("Locomotor Mortis", SpellType.CURSE,
                "Locks an opponent's legs.", 35));

//        for (Spell spell: spells)
//        {
//            if (spell.type == SpellType.SPELL) {
//                System.out.println(spell);
//            }
//        }

        // Stream equivalent normal for each loop.
//        spells.stream().forEach(s -> System.out.println(s));

//        System.out.println();
//
        // Stream equivalent for each loop with an if statement.
//        spells.stream()
//                .filter(s -> s.type == SpellType.SPELL)
//                .forEach(s -> System.out.println(s));
//
//        System.out.println();
//
//        double sum1 = spells.parallelStream()
//                .filter(s -> s.type == SpellType.SPELL)
//                .filter(s -> s.name.toLowerCase().startsWith("a"))
////                .forEach(s -> System.out.println(s));
//                .mapToDouble(s -> s.price)
//                .sum();
//        System.out.println(sum1);
//
        double sumSpells = spells.stream()
                .mapToDouble(s -> s.price)
                .sum();

        int count = (int) spells.stream().count();

        OptionalDouble avg = spells.stream()
                .mapToDouble(s -> s.price)
                .average();

        if (avg.isPresent())
        {
            System.out.println("Average = " + avg.getAsDouble() );
        }

        System.out.println("Sum of all spells: " + sumSpells);
        System.out.println("Number of spells: " + count);

        System.out.println("Parallel Streaming!");

        System.out.println("\nFirst Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
        System.out.println("\nSecond Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
        System.out.println("\nThird Parallel stream: ");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
    }
}