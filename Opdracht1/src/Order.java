import java.util.*;

public class Order implements CustomizeOrder{
    private Date date;
    private Seller seller;
    private Buyer buyer;
    private Product product;

    public Order(int d, int m, int y) {
        date = new Date(y, m, d);
    }

    public void setBuyer(Buyer byr) {
        buyer = byr;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setSeller(Seller slr) {
        seller = slr;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setProduct(Product prd) {
        product = prd;
    }

    public Product getProduct() {
        return product;
    }

    public String toString() {
        String productstring = "";
        String sellerstring = "";
        String buyerstring = "";
        String datestring = "Op: " + date.getDate() + "-" + date.getMonth() + "-" + date.getYear() + "\n";
        if (product==null) {productstring = "Geen product gedefinieerd\n";}
        else {productstring = product.toString();}
        if (seller==null) {sellerstring = "Geen verkoper gedefinieerd\n";}
        else {sellerstring = seller.toString();}
        if (buyer==null) {buyerstring = "Geen koper gedefinieerd\n";}
        else {buyerstring = buyer.toString();}
        return productstring + datestring + buyerstring + sellerstring;
    }
}
