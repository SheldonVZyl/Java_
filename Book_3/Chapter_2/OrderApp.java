package Book_3.Chapter_2;

import java.text.NumberFormat;

public class OrderApp {

    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Order order1 = new Order(5, 5.9);
        order1.setUnitPrice(45.99);
        order1.setQuantityOrdered(5);

        System.out.println("Order 1 Total: " + cf.format(order1.getOrderTotal()));
    }
}
