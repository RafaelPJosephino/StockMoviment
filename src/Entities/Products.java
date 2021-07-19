package Entities;

public class Products {

    public String name;
    public double price;
    public int stock;


    public double totalValueStock() {
        return stock * price;
    }

    public void addStock(int units) {
        stock += units;
    }

    public void removeStock(int units) {
        stock -= units;
    }

    @Override
    public String toString() {
        return "Product data :" + name + ", $" + String.format("%.2f", price) + ", " + stock + " units, Total:$" + String.format("%.2f", totalValueStock());
    }

}
