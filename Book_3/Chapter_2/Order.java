package Book_3.Chapter_2;

public class Order {

    private double unitPrice;
    private int quantityOrdered;

    // Constructor
    public Order (int u, double p) {
        quantityOrdered = u;
        unitPrice = p;
    }

    public Order (int u) {
        quantityOrdered = u;
    }

    // Getters
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantityOrdered() {
        return quantityOrdered;
    }
    // Setters
    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // Auxiliary methods
    public double getOrderTotal()
    {
        return unitPrice * quantityOrdered;
    }

}
