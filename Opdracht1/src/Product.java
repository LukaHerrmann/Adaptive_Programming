public class Product {
    private String name;
    private double price;

    public Product(String nm) {
        name = nm;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String formatprice = "";
        if (price==0.0) {return "Productnaam: " + name + "\nProductprijs: Onbepaald\n";}
        else {return "Productnaam: " + name + "\nProductprijs: €" + price + "\n";}
    }
}
