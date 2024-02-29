package Book_4.Chapter_4;

import java.util.LinkedList;

public class LinkedList1
{
    public static void main(String[] args) {

        LinkedList<String> officers = new LinkedList<>();
        String tuttle = "Tuttle";

        officers.add("Blake");
//        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        officers.add(2, tuttle);
//        String removedItem = officers.set(2, "Murdock");

        System.out.println(officers);
        officers.remove("Blake");
        System.out.println(officers);
        officers.remove(2);
        System.out.println(officers);
        officers.remove( tuttle );
        System.out.println(officers);
        officers.clear();
        System.out.println("Officers " + officers);

        for (String s : officers) {
            System.out.println(s);
        }

    }
}
