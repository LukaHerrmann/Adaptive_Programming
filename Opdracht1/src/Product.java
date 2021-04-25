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
        if (price==0.0) {return "Naam: " + name + "\nPrijs: Onbepaald";}
        else {return "Naam: " + name + "\nPrijs: €" + price;}
    }
}
